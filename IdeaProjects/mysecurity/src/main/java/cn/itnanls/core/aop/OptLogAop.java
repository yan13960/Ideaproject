package cn.itnanls.core.aop;

import cn.itnanls.core.annotation.HasPermission;
import cn.itnanls.core.annotation.OptLog;
import cn.itnanls.core.exception.NotHasPermissionException;
import cn.itnanls.entity.Permission;
import cn.itnanls.service.OptLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MemberSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
        import javax.servlet.http.HttpSession;
        import java.util.Date;
        import java.util.List;
        import java.util.stream.Stream;

/**
 *
 */
@Aspect
@Component
public class OptLogAop {
    @Resource
    private OptLogService optLogService;

    @Before("@annotation(cn.itnanls.core.annotation.OptLog)")
    public void before(JoinPoint joinPoint){
        //获取访问接口所需要的注解
        OptLog annotation =((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(OptLog.class);
        String optType=  annotation.value();
        //获取session
        ServletRequestAttributes sra=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String username=(String)sra.getRequest().getSession().getAttribute("user");

        optLogService.insert(new cn.itnanls.entity.OptLog(0,username,optType,new Date()));
    }
}
