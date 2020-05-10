package com.zf.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SearchServiceApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(SearchServiceApp.class,args);
    }
}
