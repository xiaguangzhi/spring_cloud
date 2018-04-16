package hzm.customer.service.service;

import hzm.customer.api.service.dto.Customer;

/**
 * Created by xiaohuang on 2018/4/12.
 * ----------------The heart withered--------
 */
public interface CustomerService {
    //    通过用户id查询用户
    Customer selectByPrimaryKey(Long customerId);
    //    通过用户信息查询用户
    Customer selectByName(Customer customer);

}
