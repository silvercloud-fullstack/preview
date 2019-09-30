package org.silvercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shixianchun
 * @Title: EurekaServer7001
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/27下午4:50
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002 {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServer7002.class,args);
    }

}
