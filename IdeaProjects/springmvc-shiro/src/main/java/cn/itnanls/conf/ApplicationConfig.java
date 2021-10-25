package cn.itnanls.conf;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.config.ShiroAnnotationProcessorConfiguration;
import org.apache.shiro.spring.config.ShiroBeanConfiguration;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 *配置 Shiro 的生命周期和事件
 *启用 Shiro 的注释处理
 *为 Web 使用配置 Shiro Beans（SecurityManager、SessionManager 等）
 *配置 Shiro 的 web 过滤器
 *使用 Shiro 的UrlPathHelper实现配置 Spring以确保 URL 在两个框架中的处理方式相同
 */
@Configuration
@Import({ShiroBeanConfiguration.class,
        ShiroAnnotationProcessorConfiguration.class,
        ShiroWebConfiguration.class,
        ShiroWebFilterConfiguration.class,
        ShiroRequestMappingConfig.class})
public class ApplicationConfig {

   /* @Bean
     public Realm realm() {
      return new JdbcRealm();
     }*/


  @Bean
     public Realm realm( CacheManager cacheManager) {
       JdbcRealm jdbcRealm=  new JdbcRealm();
       jdbcRealm.setCacheManager(cacheManager);
       return jdbcRealm;
     }

    @Bean
     public CacheManager cacheManager(){
         return new EhCacheManager();
     }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();

        // logged in users with the 'admin' role
        chainDefinition.addPathDefinition("/admin/**", "authc, roles[admin]");

        // logged in users with the 'document:read' permission
        chainDefinition.addPathDefinition("/docs/**", "authc, perms[document:read]");

        // all other paths require a logged in user
        chainDefinition.addPathDefinition("/user/**", "authc");
        return chainDefinition;
    }

  /*  @Bean
    protected ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilter=new ShiroFilterFactoryBean();
        shiroFilter.setLoginUrl("/login2.jsp");
        shiroFilter.setSuccessUrl("/");
        shiroFilter.setSecurityManager(securityManager);
        //就相当于urls
        Map<String,String> filterChain =new HashMap<>(8);
        filterChain.put("/user/**","authc");
        filterChain.put("/index.jsp","anon");
        filterChain.put("/admin/**", "authc,roles[admin]");
        // 退出 logout地址，shiro去清除session
        filterChain.put("/logout", "logout");
        shiroFilter.setFilterChainDefinitionMap(filterChain);
        return shiroFilter;
    }*/
}
