package hzm.customer.service.service.impl;

import hzm.customer.service.dao.CustomerDao;
import hzm.customer.api.service.dto.Customer;
import hzm.customer.service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaohuang on 2018/4/12.
 * ----------------The heart withered--------
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    protected CustomerDao customerDao;
    @Override
    public Customer selectByPrimaryKey(Long customerId) {
        return customerDao.selectByPrimaryKey(customerId);
    }

    @Override
    public Customer selectByName(Customer customer) {
        return customerDao.selectByName(customer);
    }
}
