package org.silvercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author shixianchun
 * @Title: Hystrix_dashboard
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/30下午12:19
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Hystrix_dashboard {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix_dashboard.class,args);
    }
}
