package hzm.customer.api.service.fallback;

import hzm.customer.api.service.apiservice.CustomerAPIService;
import hzm.customer.api.service.dto.Customer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by xiaohuang on 2018/4/15.
 * ----------------The heart withered--------
 */
@Component
public class CustomerFallback implements CustomerAPIService {
    private Customer customer=new Customer("error");

    @Override
    public Customer login(@RequestBody Customer customer) {
        return this.customer;
    }

    @Override
    public Customer getCustomerById(@PathVariable(value = "customerId") Long customerId) {
        return customer;
    }

    @Override
    public String getCustomerInfo(@PathVariable(value = "customerInfo") String customerInfo, @PathVariable(value = "customerId") Long customerId) {
        return "error";
    }
}
