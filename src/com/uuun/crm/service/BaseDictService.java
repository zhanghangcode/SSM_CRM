package com.uuun.crm.service;

import com.uuun.crm.pojo.BaseDict;

import java.util.List;

/**
 * @author Caden
 * @version 1.0.0
 * @ClassName BaseDictService.java
 * @Description ok
 * @createTime 2019年10月24日 22:31:00
 */

public interface BaseDictService {
    public List<BaseDict> selectBaseDictListByCode(String code);
}
