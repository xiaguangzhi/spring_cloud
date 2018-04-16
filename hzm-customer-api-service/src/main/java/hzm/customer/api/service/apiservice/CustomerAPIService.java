package hzm.customer.api.service.apiservice;

import hzm.customer.api.service.dto.Customer;

import hzm.customer.api.service.fallback.CustomerFallback;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaohuang on 2018/4/15.
 * ----------------The heart withered--------
 */
@FeignClient(value = "customer-service" ,fallback = CustomerFallback.class)
@RequestMapping(value = "api")
@Api(value = "CustomerAPI",description = "CustomerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public interface CustomerAPIService {

    @PostMapping(value = "login")
    @ApiOperation(value = "登录",httpMethod = "POST",produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiImplicitParam(name = "customer",value = "用户登录信息" ,dataType = "Customer")
    public Customer login(@RequestBody Customer customer);

    @GetMapping(value = "/{customerId}")
    @ApiOperation(value = "通过用户id查询用户",httpMethod = "GET",produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiImplicitParam(name = "customerId",value = "用户id" ,dataType = "Long",required =true,paramType = "path")
    public Customer getCustomerById(@PathVariable(value = "customerId") Long customerId) ;

//    通过用户id得到指定用户信息

    @GetMapping(value = "/{customerInfo}/{customerId}")
    public   String getCustomerInfo(@PathVariable(value = "customerInfo") String customerInfo,
                                    @PathVariable(value = "customerId") Long customerId);


}
