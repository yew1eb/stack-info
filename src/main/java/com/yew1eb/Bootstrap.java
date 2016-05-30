package com.yew1eb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhouhai
 * @createTime 16/5/28
 * @description Spring Boot Version : 1.4.0.M3
 * http://docs.spring.io/spring-boot/docs/1.4.0.M3/reference/htmlsingle/
 */


@SpringBootApplication
public class Bootstrap {
    public static void main(String[] args) {
       // SpringApplication.run(Bootstrap.class, args);
        SpringApplication app = new SpringApplication(Bootstrap.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
