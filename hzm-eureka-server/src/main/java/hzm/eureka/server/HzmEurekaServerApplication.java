package hzm.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//开启服务注册中心
@EnableEurekaServer
@SpringBootApplication
public class HzmEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzmEurekaServerApplication.class, args);
	}
}
