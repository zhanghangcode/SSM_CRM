package com.uuun.crm.service;

import com.uuun.crm.pojo.Customer;
import com.uuun.crm.pojo.QueryVo;
import com.uuun.crm.utils.Page;

/**
 * @author Caden
 * @version 1.0.0
 * @ClassName CustomerService.java
 * @Description ok
 * @createTime 2019年10月24日 22:31:00
 */

public interface CustomerService {

    // 通过四个条件 查询分页对象
    public Page<Customer> selectPageByQueryVo(QueryVo vo);

    //通过ID查询客户
    public Customer selectCustomerById(Integer id);

    //修改客户通过ID
    public void updateCustomerById(Customer customer);

    //通过ID 删除客户
    public void deleteCustomerById(Integer id);
}
