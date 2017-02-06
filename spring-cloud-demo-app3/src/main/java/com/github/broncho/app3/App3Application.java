package com.github.broncho.app3;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author: ZhangXiao
 * Created: 2017/2/6
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class App3Application {
    
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(App3Application.class)
                .web(true)
                .run(args);
    }
    
}
