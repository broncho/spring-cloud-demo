package com.github.broncho.eurekaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: ZhangXiao
 * Created: 2017/1/23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {
    
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaserverApplication.class).web(true).run(args);
    }
}
