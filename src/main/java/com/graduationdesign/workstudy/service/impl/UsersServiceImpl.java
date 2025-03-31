package com.graduationdesign.workstudy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.graduationdesign.workstudy.common.Result;
import com.graduationdesign.workstudy.entity.Users;
import com.graduationdesign.workstudy.entity.enums.EnumUsers;
import com.graduationdesign.workstudy.mapper.UsersMapper;
import com.graduationdesign.workstudy.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.management.relation.RoleInfo;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lmt
 * @since 2025-03-30
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Override
    public IPage<Users> getUsersByPage(Integer pageNum, Integer pageSize, String keyword) {
        Page<Users> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Users> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Users::getUserId, keyword);
        return this.page(page, wrapper);
    }

    // 用户登录
    @Override
    public Result<Users> login(String username, String password) {
        //  用户名或密码错误
        LambdaQueryWrapper<Users> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Users::getUsername, username);
        wrapper.eq(Users::getPassword, password);
        Users user = this.getOne(wrapper);
        if (user == null) {
            return Result.error("用户名或密码错误");
        }
        // 检查状态
        if (user.getStatus() == EnumUsers.Status.FREEZE) {
            return Result.error("用户已被冻结");
        }

        return Result.success(user);
    }

    // 用户注册
    @Override
    public Result<Users> register(Users user) {
        if (this.save(user)) {
            return Result.success(user);
        } else {
            return Result.error("注册失败");
        }
    }

    // 修改密码
    @Override
    public Result<Users> updatePassword(String username, String oldPassword, String newPassword) {
        LambdaQueryWrapper<Users> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Users::getUsername, username);
        wrapper.eq(Users::getPassword, oldPassword);
        Users user = this.getOne(wrapper);
        if (user == null) {
            return Result.error("旧密码错误");
        }
        user.setPassword(newPassword);
        if (this.updateById(user)) {
            return Result.success(user);
        } else {
            return Result.error("修改失败");
        }
    }
}
