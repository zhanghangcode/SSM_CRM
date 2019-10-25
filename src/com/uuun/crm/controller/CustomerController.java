package com.uuun.crm.controller;

import com.uuun.crm.pojo.BaseDict;
import com.uuun.crm.service.BaseDictService;
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

    //解决硬编码问题
    @Value("${fromType.code}")
    private String fromTypeCode;

    @Value("${industryType.code}")
    private String industryTypeCode;

    @Value("${levelType.code}")
    private String levelTypeCode;

    @RequestMapping(value = "/customer/list")
    public String list(Model model){

        List<BaseDict> fromType = baseDictService.selectBaseDictListByCode(fromTypeCode);
        List<BaseDict> industryType = baseDictService.selectBaseDictListByCode(industryTypeCode);
        List<BaseDict> levelType = baseDictService.selectBaseDictListByCode(levelTypeCode);
        model.addAttribute("fromType",fromType);
        model.addAttribute("industryType",industryType);
        model.addAttribute("levelType",levelType);
        return "customer";
    }
}
