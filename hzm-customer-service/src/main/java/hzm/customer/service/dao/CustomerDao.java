package hzm.customer.service.dao;

import hzm.customer.api.service.dto.Customer;

/**
 * Created by xiaohuang on 2018/4/12.
 * ----------------The heart withered--------
 */
public interface CustomerDao {
    int deleteByPrimaryKey(Long customerId);

    int insert(Customer customer);

    int insertSelective(Customer customer);

    Customer selectByPrimaryKey(Long customerId);

    int updateByPrimaryKeySelective(Customer customer);

    int updateByPrimaryKey(Customer customer);

    Customer selectByName(Customer customer);
}