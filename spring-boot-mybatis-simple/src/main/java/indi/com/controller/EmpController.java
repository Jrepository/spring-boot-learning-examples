package indi.com.controller;


import indi.com.entity.Emp;
import indi.com.service.IEmpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 使用配置文件的方式
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
    @Resource
    private IEmpService service;

    @RequestMapping("/getEmpById")
    public Emp getEmpById(@RequestParam("id") String id){
        return service.getEmpById(id);
    }
}
