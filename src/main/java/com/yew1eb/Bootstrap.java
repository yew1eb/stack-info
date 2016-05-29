package com.yew1eb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhouhai
 * @createTime 16/5/28
 * @description
 */


@SpringBootApplication
public class Bootstrap {
    public static void main(String[] args) throws Exception {
        //SpringApplication.run(Bootstrap.class, args);
        SpringApplication app = new SpringApplication(Bootstrap.class);
        //app.setBannerMode(Banner.Mode.OFF);
        /*
        // 开启--debug模式启动, 查看spring boot 自动加载了那些配置
        args = new String[1];
        args[0] = "--debug";
        */

        app.run(args);
    }
}
