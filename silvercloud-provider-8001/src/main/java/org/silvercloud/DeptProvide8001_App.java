package org.silvercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shixianchun
 * @Title: DeptProvide8001_App
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/25下午5:01
 */

@SpringBootApplication
@EnableEurekaClient // 服务中心注册
@EnableDiscoveryClient // 服务发现
@EnableCircuitBreaker // 熔断
public class DeptProvide8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvide8001_App.class, args);
    }
}
