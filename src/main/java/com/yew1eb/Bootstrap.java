package com.yew1eb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zhouhai
 * @createTime 16/5/28
 * @description Spring Boot Version : 1.4.0.M3
 * http://docs.spring.io/spring-boot/docs/1.4.0.M3/reference/htmlsingle/
 */


@SpringBootApplication
@ServletComponentScan//这个就是扫描相应的Servlet<=>@WebServlet, Filter<=>@WebFilter, Listener<=>@WebListener
public class Bootstrap {
    public static void main(String[] args) {
       // SpringApplication.run(Bootstrap.class, args);
        SpringApplication app = new SpringApplication(Bootstrap.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
