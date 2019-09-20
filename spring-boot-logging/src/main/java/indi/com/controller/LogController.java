package indi.com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);
    @RequestMapping("/log")
    public String log(){
        logger.info("info级别的日志...");
        logger.debug("debug级别的日志...");
        logger.warn("warn级别的日志...");
        logger.error("error级别的日志...");
        return "log";
    }
}
