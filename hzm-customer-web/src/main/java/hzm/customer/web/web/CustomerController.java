package hzm.customer.web.web;

import hzm.customer.api.service.dto.Customer;
import hzm.customer.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaohuang on 2018/4/13.
 * ----------------The heart withered--------
 */
@Controller
//@RequestMapping("${version}/customer")
public class CustomerController {
    @RequestMapping("")
    public   String  index(){
        return  "index";
    }
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/cardID",method = RequestMethod.GET)
    public   String cardId(HashMap hashMap){
        String  customerInfo="customerCardId";
        long customerId=62360653091020808L;
        String cardId = customerService.getCustomerInfo(customerInfo, customerId);
        hashMap.put("cardId",cardId);
            return "cardid";
    }


    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public  String login(@ModelAttribute Customer customer ,HashMap hashMap){
        customer = customerService.login(customer);
        if (customer == null) {
            return  "login";
        }
        hashMap.put("customer",customer);
        return "cardid";

    }
    
    
}
