package com.graduationdesign.workstudy.config;


import com.graduationdesign.workstudy.interceptors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置放行资源
        // 无需拦截的接口集合
        List<String> ignorePath = new ArrayList<>();
        // knife4j(swagger)
        ignorePath.add("/swagger-resources/**");
        ignorePath.add("/doc.html");
        ignorePath.add("/v3/**");
        ignorePath.add("/webjars/**");
        ignorePath.add("/static/**");
        ignorePath.add("/templates/**");
        ignorePath.add("/error");
        // 登录页面
        ignorePath.add("/users/login");
        //根据员工id
        ignorePath.add("/users/**");
        ignorePath.add("/departments/**");
        ignorePath.add("/positions/**");
        ignorePath.add("/employees/**");
        ignorePath.add("/salaries/**");
        ignorePath.add("/attendances/**");
        ignorePath.add("/announcements/**");

        registry.addInterceptor(loginInterceptor).excludePathPatterns(ignorePath);
    }
}
