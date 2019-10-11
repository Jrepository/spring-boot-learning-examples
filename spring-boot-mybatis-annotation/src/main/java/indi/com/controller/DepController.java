package indi.com.controller;


import indi.com.entity.Dep;
import indi.com.service.IDepService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 使用注解的方式
 */
@RestController
@RequestMapping("/dep")
public class DepController {

    @Resource
    private IDepService service;

    @RequestMapping("/getDepById/{id}")
    public Dep getEmpById(@PathVariable("id") String id){
        return service.getDepById(id);
    }

    @RequestMapping("/getDeps")
    public List<Dep> getEmpById(){
        return service.getDeps();
    }

    @RequestMapping("/insertDep")
    public void insertDep(Dep dep){
        service.insertDep(dep);
    }
}
