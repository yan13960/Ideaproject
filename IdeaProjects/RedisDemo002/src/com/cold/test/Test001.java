package com.cold.test;

import com.cold.dao.ProvinceCityDao;
import com.cold.dao.ProvinceCityDaoImpl;
import com.cold.po.City1;

import java.util.List;

/**
 * describe
 * 作者：曾昭武
 */
public class Test001 {

    public static void main(String[] args) {
        ProvinceCityDao provinceCityDao = new ProvinceCityDaoImpl();
        /*List<Province1> list = provinceCityDao.getProvince();

        for(Province1 p:list){
            System.out.println(p);
        }*/

        List<City1> list =  provinceCityDao.getCity("110000");

        for(City1 p:list){
            System.out.println(p);
        }
    }
}
