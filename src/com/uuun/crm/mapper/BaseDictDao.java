package com.uuun.crm.mapper;

import com.uuun.crm.pojo.BaseDict;

import java.util.List;

/**
 * @author Caden
 * @version 1.0.0
 * @ClassName BaseDictDao.java
 * @Description ok
 * @createTime 2019年10月24日 21:56:00
 */

public interface BaseDictDao {
     List<BaseDict> selectBaseDictListByCode(String code);
}
