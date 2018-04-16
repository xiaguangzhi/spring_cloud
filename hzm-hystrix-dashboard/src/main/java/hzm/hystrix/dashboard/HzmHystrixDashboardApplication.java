package hzm.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringCloudApplication
public class HzmHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzmHystrixDashboardApplication.class, args);
	}
}
