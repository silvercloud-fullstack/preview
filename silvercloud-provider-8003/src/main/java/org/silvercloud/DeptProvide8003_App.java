package org.silvercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvide8003_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvide8003_App.class,args);
    }
}
