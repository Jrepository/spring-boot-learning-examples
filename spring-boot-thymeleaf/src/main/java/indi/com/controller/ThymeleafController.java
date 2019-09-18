package indi.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    /**
     *  集成thymeleaf
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     *  在thymeleaf引用js、css静态资源
     * @return
     */
    @RequestMapping("/index2")
    public String index2(){
        return "index2";
    }

    /**
     *  在thymeleaf引用js、css静态资源
     * @return
     */
    @RequestMapping("/index3")
    public String index3(){
        return "index3";
    }
}
