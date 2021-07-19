package com.example.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // spring-cloud-netflix 의존성을 기반으로 하며 eureka에서만 사용할 수 있음
// @EnableDiscoveryClient // spring-cloud-commons 의존성을 기반으로 하며 classpath에서 구현
// "Discovery Service"의 다양한 구현체 (eureka, consul, zookeeper)를 사용하면 @EnableDiscoveryClient
// eureka만 사용하면 @EnableEurekaClient
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }

}
