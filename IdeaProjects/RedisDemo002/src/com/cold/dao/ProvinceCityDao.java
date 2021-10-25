package com.cold.dao;

import com.cold.po.City1;
import com.cold.po.Province1;


import java.util.List;

/**
 * describe
 * 作者：曾昭武
 */
public interface ProvinceCityDao {

    /**
     * 获取省
     */
    public List<Province1> getProvince();
    /**
     * 获取市
     * pId 省id
     */
    public List<City1> getCity(String pId);
}
