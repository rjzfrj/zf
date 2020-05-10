package com.zf.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * 功能描述:
 * @param:
 * @return:
 * @auther: zhifeng
 * @date: 2020/4/19 21:24
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZfApiGateway {

    public static void main(String[] args) {
        SpringApplication.run(ZfApiGateway.class,args);
    }
}
