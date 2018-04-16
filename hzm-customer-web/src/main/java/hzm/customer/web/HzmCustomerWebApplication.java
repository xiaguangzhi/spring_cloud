package hzm.customer.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/*
@EnableEurekaClient
@SpringBootApplication
//开启断路器功能
@EnableCircuitBreaker*/
@SpringCloudApplication
@EnableFeignClients
public class HzmCustomerWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(HzmCustomerWebApplication.class, args);
	}
}
