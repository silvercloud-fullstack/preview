package org.silvercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author shixianchun
 * @Title: Hystrix_turbine
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/30下午2:32
 */
@SpringBootApplication
@EnableTurbine
public class Hystrix_turbine {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix_turbine.class, args);
    }
}
