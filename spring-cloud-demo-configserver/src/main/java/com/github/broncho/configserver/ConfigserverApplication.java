package com.github.broncho.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Author: ZhangXiao
 * Created: 2017/1/23
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {
    
    
    public static void main(String[] args) {
        SpringApplication.run(ConfigserverApplication.class);
    }
}
