package com.mfanw.helloworld.thymeleaf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot 中推荐使用 Thymeleaf 作为模板引擎，因为 Thymeleaf 提供了完美的 Spring MVC 支持
 *
 * @author mengwei
 */
@RestController
@SpringBootApplication
public class ThymeleafApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThymeleafApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
        LOGGER.warn("启用 SpringBoot Security, 默认登陆用户为 user, 默认登陆密码为日志(往上翻)中的 Using generated security password:XXX");
    }

}