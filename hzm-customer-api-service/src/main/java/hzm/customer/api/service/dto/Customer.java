package hzm.customer.api.service.dto;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by xiaohuang on 2018/4/12.
 * ----------------The heart withered--------
 */
@ApiModel(value = "customer",description = "”√ªß")
public class Customer implements Serializable {
    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public Customer() {

    }

    @JsonSerialize(using = ToStringSerializer.class)

    private Long customerId;

    private String customerName;

    private String customerPassword;

    private String customerCardId;

    private String customerPhone;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword == null ? null : customerPassword.trim();
    }

    public String getCustomerCardId() {
        return customerCardId;
    }

    public void setCustomerCardId(String customerCardId) {
        this.customerCardId = customerCardId == null ? null : customerCardId.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }
}