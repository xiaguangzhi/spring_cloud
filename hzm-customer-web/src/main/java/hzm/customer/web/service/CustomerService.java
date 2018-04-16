package hzm.customer.web.service;


import hzm.customer.api.service.apiservice.CustomerAPIService;
import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by xiaohuang on 2018/4/14.
 * ----------------The heart withered--------
 */
@FeignClient(value = "customer-service" )
public interface CustomerService extends CustomerAPIService {

}
