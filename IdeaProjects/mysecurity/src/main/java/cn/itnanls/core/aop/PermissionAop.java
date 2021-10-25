package cn.itnanls.core.aop;

import cn.itnanls.core.Subject;
import cn.itnanls.core.annotation.HasPermission;
import cn.itnanls.entity.Permission;
import cn.itnanls.core.exception.NotHasPermissionException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
@Aspect
@Component
public class PermissionAop {
    @Around("@annotation(cn.itnanls.core.annotation.HasPermission)")
    public Object around(ProceedingJoinPoint joinPoint){
        //获取session
      /*  ServletRequestAttributes sra=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpSession session=sra.getRequest().getSession();
*/
        HttpSession session = Subject.getSession();

        //拿到权限
        List<Permission> permissions = (List<Permission>) (session.getAttribute("permissions"));

        //获取访问接口所需要的权限
        HasPermission annotation = ((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(HasPermission.class);
        String[] needPermissions = annotation.value();

        //验证匹配
        boolean flag = Stream.of(needPermissions).allMatch(permissions::contains);

        if (!flag){
            throw  new  NotHasPermissionException("您没有该权限");
        }

        Object returnObj=null;
        long start = System.currentTimeMillis();

        //调用方法
        try {
            returnObj= joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("该方法用了"+(end-start)+"毫秒");
        return returnObj;
    }

  /*  @Before("@annotation(cn.itnanls.core.annotation.HasPermission)")
    public void around(JoinPoint joinPoint){
        //获取session
        ServletRequestAttributes sra=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpSession session=sra.getRequest().getSession();
        List<Permission> permissions = (List<Permission>) (session.getAttribute("permissions"));

        //获取访问接口所需要的权限
        HasPermission annotation = joinPoint.getTarget().getClass().getAnnotation(HasPermission.class);
        String[] needPermissions = annotation.value();

        //验证匹配
        boolean flag = Stream.of(needPermissions).allMatch(permissions::contains);

        if (!flag){
            throw  new  NotHasPermissionException("您没有该权限");
        }
    }*/
}
