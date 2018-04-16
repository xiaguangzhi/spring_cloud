package hzm.customer.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by xiaohuang on 2018/4/12.
 * ----------------The heart withered--------
 */
//¿ªÆô·þÎñ×¢²á
@EnableEurekaClient
@SpringBootApplication
@MapperScan("hzm.customer.service.dao")
@EnableSwagger2
 public  class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
}
