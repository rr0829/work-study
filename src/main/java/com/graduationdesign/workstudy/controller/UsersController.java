package com.graduationdesign.workstudy.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.graduationdesign.workstudy.common.PageResultBean;
import com.graduationdesign.workstudy.common.Result;
import com.graduationdesign.workstudy.entity.Users;
import com.graduationdesign.workstudy.service.UsersService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lmt
 * @since 2025-03-30
 */
@Tag(name = "用户接口")
@RestController
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    /**
     * 用户列表分页
     * @param pageSize 每页显示的条数
     * @param currentPage  要查询的页
     * @param name  用户姓名
     * @return  Result<PageResultBean<List<User>>>
     */
    @GetMapping("/pageList")
    @Operation(summary = "用户列表分页查询")
    @Parameters({
            @Parameter(name = "Authorization", in = ParameterIn.HEADER, required = true, description = "token"),
            @Parameter(name = "pageSize", required = true, description = "每页显示的条数"),
            @Parameter(name = "currentPage", required = true, description = "要查询的页"),
            @Parameter(name = "name", description = "用户姓名", required = false)
    })
    public Result<PageResultBean<Users>> pageList(@RequestParam int pageSize, @RequestParam int currentPage, @Nullable @RequestParam String name) {
        IPage<Users> page = usersService.getUsersByPage(pageSize, currentPage, name);
        if (page == null) {
            return Result.error("查询失败");
        }
        //PageResultBean<User> pageResultBean = new PageResultBean<User>(page.getTotal(), page.getRecords());
        return Result.success(PageResultBean.getInstance(page.getTotal(), page.getRecords()));

    }

}
