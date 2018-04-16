package hzm.customer.service.controller;

import hzm.customer.api.service.apiservice.CustomerAPIService;
import hzm.customer.api.service.dto.Customer;
import hzm.customer.service.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaohuang on 2018/4/12.
 * ----------------The heart withered--------
 */
@RestController
public class CustomerController implements CustomerAPIService {
    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "login")
    @ApiOperation(value = "��¼",httpMethod = "POST",produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiImplicitParam(name = "customer",value = "�û���¼��Ϣ" ,dataType = "Customer")
    public Customer login(@RequestBody Customer customer) {
        return customerService.selectByName(customer);
    }

    @GetMapping(value = "/{customerId}")
    @ApiOperation(value = "ͨ���û�id��ѯ�û�",httpMethod = "GET",produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiImplicitParam(name = "customerId",value = "�û�id" ,dataType = "Long",required =true,paramType = "path")
    public Customer getCustomerById(@PathVariable(value = "customerId") Long customerId) {
        return customerService.selectByPrimaryKey(customerId);
    }

//    ͨ���û�id�õ�ָ���û���Ϣ

    @GetMapping(value = "/{customerInfo}/{customerId}")
    public   String getCustomerInfo(@PathVariable(value = "customerInfo") String customerInfo,
                                    @PathVariable(value = "customerId") Long customerId){
        if ("customerCardId".equals(customerInfo)){
            return        customerService.selectByPrimaryKey(customerId).getCustomerCardId();
        }
        return  null;


    }


}
