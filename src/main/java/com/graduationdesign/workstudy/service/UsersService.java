package com.graduationdesign.workstudy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
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


}
