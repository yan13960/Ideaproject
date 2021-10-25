package cn.itnanls.core;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 */
public class LoginFilter implements Filter {

    public String[] ignoreUrl;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String ignore = filterConfig.getInitParameter("ignore");
        ignoreUrl = ignore.split(",");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        //判断请求的uri是否允许通过
        boolean  isIgnore= isIgnore(request);
        if (isIgnore){
         chain.doFilter(servletRequest,servletResponse);
        } else {
            HttpSession session = request.getSession();
            Object user = session.getAttribute("user");
            if (user==null){
                response.sendRedirect("/");
            }else {
                chain.doFilter(servletRequest,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {

    }
    public boolean isIgnore(ServletRequest request){
        HttpServletRequest httpServletRequest=(HttpServletRequest)request;
        for (String ignore : ignoreUrl) {
            if (httpServletRequest.getRequestURI().equals(ignore)){
                return true;
            }
        }
        return false;
    }
}
