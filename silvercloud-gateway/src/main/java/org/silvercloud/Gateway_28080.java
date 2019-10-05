package org.silvercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author shixianchun
 * @Title: Gateway_28080
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/30下午3:36
 */
@SpringBootApplication
@EnableZuulProxy
public class Gateway_28080 {
    public static void main(String[] args) {
        SpringApplication.run(Gateway_28080.class,args);
    }
}
