package com.graduationdesign.workstudy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.graduationdesign.workstudy.common.Result;
import com.graduationdesign.workstudy.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lmt
 * @since 2025-03-30
 */
public interface UsersService extends IService<Users> {
    //分页
    IPage<Users> getUsersByPage(Integer pageNum, Integer pageSize, String keyword);

    // 用户登录
    Result<Users> login(String username, String password);

    // 用户注册
    Result<Users> register(Users user);

    // 根据用户修改密码
    Result<Users> updatePassword(String username, String oldPassword, String newPassword);


}
