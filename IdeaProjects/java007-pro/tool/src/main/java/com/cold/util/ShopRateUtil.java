package com.cold.util;

import com.cold.entity.RateEntity;
import com.cold.param.RedisParamenter;
import com.cold.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Agu
 */
@Component
public class ShopRateUtil {


    @Autowired
    RedisService redisService;



    //新增商户时初始化默认汇率
    public void initShopRate(Integer shopId) {
        redisService.getHashOperations().putAll(RedisParamenter.SHOP_RATE_KEY + shopId.toString(), redisService.getAll(RedisParamenter.INIT_SHOP_RATE_KEY));
    }


    //获取商家所有汇率
    public Map<String,String> getAllRateByShop(Integer shopId){
        return  redisService.getAll(RedisParamenter.SHOP_RATE_KEY+shopId);
    }

    //获取商家某个汇率
    public RateEntity getRateByShop(Integer shopId, String rateName){
        return JSONUtils.toObject(redisService.getHashOperations().get(RedisParamenter.SHOP_RATE_KEY+shopId,rateName),RateEntity.class);

    }


}
