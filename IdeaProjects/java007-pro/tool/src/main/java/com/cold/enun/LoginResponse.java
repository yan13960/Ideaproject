package com.cold.enun;


import com.cold.param.RedisParamenter;

/**
 * @author Agu
 */
public enum LoginResponse {

    ADMIN_LOGIN(RedisParamenter.ADMIN_LOING_USER_REDIS_KEY,
            "/page/admin/", "/login/admin.html", "/login/admin.html");


    String cookieKey;

    String responseUrl;

    String[] skipUrl;

    String filterUrl;

    LoginResponse(String cookieKey, String filterUrl, String responseUrl, String... skipUrl) {
        this.cookieKey = cookieKey;
        this.skipUrl = skipUrl;
        this.responseUrl = responseUrl;
        this.filterUrl = filterUrl;
    }
    //admin/xx.html/xx/xxx.html
    public static LoginResponse filterUrl(String url) {
        for (LoginResponse value : LoginResponse.values()) {
            if (url != null && url.indexOf(value.getFilterUrl()) != -1) {
                if (url.lastIndexOf(".html")!=-1)
                return value;
            }
        }
        return null;
    }

    public String getCookieKey() {
        return cookieKey;
    }

    public void setCookieKey(String cookieKey) {
        this.cookieKey = cookieKey;
    }

    public String[] getSkipUrl() {
        return skipUrl;
    }

    public void setSkipUrl(String[] skipUrl) {
        this.skipUrl = skipUrl;
    }

    public String getFilterUrl() {
        return filterUrl;
    }

    public void setFilterUrl(String filterUrl) {
        this.filterUrl = filterUrl;
    }

    public String getResponseUrl() {
        return responseUrl;
    }

    public void setResponseUrl(String responseUrl) {
        this.responseUrl = responseUrl;
    }
}
