package org.silvercloud;

import org.loadbalancerule.ConfigLBRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shixianchun
 * @Title: DeptConsumer80_app
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/25下午7:17
 */
@SpringBootApplication(scanBasePackages = "org.silvercloud")
@EnableEurekaClient
@RibbonClient(name = "SILVERCLOUD-DEPT",configuration = ConfigLBRule.class)
@EnableFeignClients(basePackages = "org.silvercloud")
@EnableCircuitBreaker //熔断
public class DeptConsumer80_app {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer80_app.class,args);

    }
}
