package com.uuun.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Caden
 * @version 1.0.0
 * @ClassName CustomerController.java
 * @Description ok
 * @createTime 2019年10月23日 19:54:00
 */
@Controller
public class CustomerController {

    @RequestMapping(value = "/customer/list")
    public String list(){

        return "customer";
    }
}
