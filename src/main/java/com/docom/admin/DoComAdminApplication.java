package com.docom.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author lw
 * @date 2022/4/11 5:25 下午
 */
@SpringBootApplication
@EnableAdminServer
public class DoComAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(DoComAdminApplication.class, args);
    }
}
