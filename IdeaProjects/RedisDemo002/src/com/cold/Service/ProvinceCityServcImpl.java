package com.cold.Service;

import com.cold.dao.ProvinceCityDao;
import com.cold.dao.ProvinceCityDaoImpl;
import com.cold.po.City1;
import com.cold.po.Province1;
import com.cold.utils.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * describe
 * 作者：曾昭武
 */
public class ProvinceCityServcImpl implements  ProvinceCityServcie{
    ProvinceCityDao provinceCityDao = new ProvinceCityDaoImpl();
    /**
     * 获取省
     */
    public List<Province1> getProvince(){
        return provinceCityDao.getProvince();
    }
    /**
     * 获取市
     * pId 省id
     */
    public List<City1> getCity(String pId){
        return provinceCityDao.getCity(pId);
    }


    /**
     * 获取省
     */
    public String getProvinceJson(){
        //1先从redis中查询数据
        //1.1.获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        //1.2从redis获取数据
        String  province_json=jedis.get("province");
        //1.3.必需判断，province_json 是否有值
        if(province_json==null ||province_json.length()==0  ){
            //2.1没有数据 需要调用dao层，查询数据
            List<Province1> list= provinceCityDao.getProvince();
            //2.2.将list序列化为json格式
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json=mapper.writeValueAsString(list);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            //2.3.将json数据存入redis
            jedis.set("province",province_json);
            //2.3归还连接
            jedis.close();
        }else {
            System.out.println("有数据，直接使用缓存(redis)");
    }

        return province_json;
    }
    /**
     * 获取市
     * pId 省id
     */
    public String getCityJson(String pId){
        //1先从redis中查询数据
        //1.1.获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        //1.2从redis获取数据
        String  city_json=jedis.get("city"+pId);
        //1.3.必需判断，province_json 是否有值
        if(city_json==null ||city_json.length()==0  ){
            //2.1没有数据 需要调用dao层，查询数据
            List<City1> list= provinceCityDao.getCity(pId);
            //2.2.将list序列化为json格式
            ObjectMapper mapper = new ObjectMapper();
            try {
                city_json=mapper.writeValueAsString(list);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            //2.3.将json数据存入redis
            jedis.set("city"+pId,city_json);
            //2.3归还连接
            jedis.close();
        }else {
            System.out.println("有数据，直接使用缓存(redis)");
        }

        return city_json;
    }
}
