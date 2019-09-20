package indi.com.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import indi.com.entity.User;
import indi.com.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-09-19
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService service;

    @RequestMapping("/list")
    public List<User> getUsers(){
        return service.list();
    }
    @RequestMapping("/getPages")
    public IPage<User> getPages(){
        Page<User> page = new Page<>();
        return service.page(page);
    }
}
