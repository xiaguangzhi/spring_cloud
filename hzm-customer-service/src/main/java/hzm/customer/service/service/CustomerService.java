package hzm.customer.service.service;

import hzm.customer.api.service.dto.Customer;

/**
 * Created by xiaohuang on 2018/4/12.
 * ----------------The heart withered--------
 */
public interface CustomerService {
    //    ͨ���û�id��ѯ�û�
    Customer selectByPrimaryKey(Long customerId);
    //    ͨ���û���Ϣ��ѯ�û�
    Customer selectByName(Customer customer);

}
