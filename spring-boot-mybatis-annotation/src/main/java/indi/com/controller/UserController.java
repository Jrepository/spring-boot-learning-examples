package indi.com.controller;

import indi.com.bean.User;
import indi.com.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }


    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }


    @RequestMapping("/getUserByName/{name}")
    public List<User> getUserByName(@PathVariable String name){
        List<User> list = userService.getUserByName(name);
        return userService.getUserByName(name);
    }
}
