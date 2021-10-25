package com.cold.Service;

import com.cold.po.City1;
import com.cold.po.Province1;


import java.util.List;

/**
 * describe
 * 作者：曾昭武
 */
public interface ProvinceCityServcie {

    /**
     * 获取省
     */
    public List<Province1> getProvince();
    /**
     * 获取市
     * pId 省id
     */
    public List<City1> getCity(String pId);

    /**
     * 获取省
     */
    public String getProvinceJson();
    /**
     * 获取市
     * pId 省id
     */
    public String getCityJson(String pId);
}
