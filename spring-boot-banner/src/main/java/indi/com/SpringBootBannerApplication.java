package indi.com;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringBootBannerApplication.class);
        //关闭Banner
        //springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}