package com.myth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.myth.ums.mapper")
public class UmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(UmsApplication.class,args);
    }
}
