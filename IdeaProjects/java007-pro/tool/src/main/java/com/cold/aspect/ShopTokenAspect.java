package com.cold.aspect;

import com.cold.annotation.Pmap;
import com.cold.enun.ShopEnum;
import com.cold.param.RedisParamenter;
import com.cold.util.P;
import com.cold.util.R;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author Agu
 */
@Component
@Aspect
public class ShopTokenAspect {

    @Around("@annotation(com.cold.annotation.ShopToken)")
    @Order(-2)
    public Object shopToken(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        P p = null;
        Method method = signature.getMethod();
        for (int i = 0; i < method.getParameters().length; i++) {
            if (method.getParameters()[i].isAnnotationPresent(Pmap.class)) {
                p = (P) proceedingJoinPoint.getArgs()[i];
            }
        }
        if (p.getRequest().getHeader(ShopEnum.SYS_SHOP_ID.getName())!=null){
            p.put("shopId",p.getRequest().getHeader(ShopEnum.SYS_SHOP_ID.getName()));
            return  proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        }else {
            if (p.getRequest().getHeader(RedisParamenter.ADMIN_LOING_USER_REDIS_KEY)!=null) {
                return  proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
            }else {
                return R.error("未登录");
            }
        }
    }
}
