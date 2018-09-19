package com.petstore.eurekaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
@EnableHystrixDashboard
public class App 
{
    public static void main(String args[])
    {
    	SpringApplication.run(App.class,args);
    }
}
