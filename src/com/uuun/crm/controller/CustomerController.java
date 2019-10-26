package com.uuun.crm.controller;

import com.uuun.crm.pojo.BaseDict;
import com.uuun.crm.pojo.Customer;
import com.uuun.crm.pojo.QueryVo;
import com.uuun.crm.service.BaseDictService;
import com.uuun.crm.service.CustomerService;
import com.uuun.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Caden
 * @version 1.0.0
 * @ClassName CustomerController.java
 * @Description ok
 * @createTime 2019年10月23日 19:54:00
 */
@Controller
public class CustomerController {

    @Autowired
    private BaseDictService baseDictService;
    @Autowired
    private CustomerService customerService;

    //解决硬编码问题
    @Value("${fromType.code}")
    private String fromTypeCode;

    @Value("${industryType.code}")
    private String industryTypeCode;

    @Value("${levelType.code}")
    private String levelTypeCode;

    @RequestMapping(value = "/customer/list")
    public String list(QueryVo vo, Model model){

        List<BaseDict> fromType = baseDictService.selectBaseDictListByCode(fromTypeCode);
        List<BaseDict> industryType = baseDictService.selectBaseDictListByCode(industryTypeCode);
        List<BaseDict> levelType = baseDictService.selectBaseDictListByCode(levelTypeCode);
        model.addAttribute("fromType",fromType);
        model.addAttribute("industryType",industryType);
        model.addAttribute("levelType",levelType);

        //返回查询结果
        Page<Customer> page = customerService.selectPageByQueryVo(vo);
        model.addAttribute("page",page);
        model.addAttribute("custName",vo.getCustName());
        model.addAttribute("custSource",vo.getCustSource());
        model.addAttribute("custIndustry",vo.getCustIndustry());
        model.addAttribute("custLevel",vo.getCustLevel());

        return "customer";
    }
}
