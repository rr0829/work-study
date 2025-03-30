package com.graduationdesign.workstudy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.graduationdesign.workstudy.entity.Users;
import com.graduationdesign.workstudy.mapper.UsersMapper;
import com.graduationdesign.workstudy.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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
}
