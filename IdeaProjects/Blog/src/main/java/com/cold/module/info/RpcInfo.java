package com.cold.module.info;

import java.io.Serializable;
import java.net.ServerSocket;

/**
 *
 */
public class RpcInfo implements Serializable {

    private static final long serialVersionUID = -1492368438817401167L;
    /**
     *假设知道一切的信息
     * 类的包名
     * 类名
     * 方法名
     * 方法参数类型
     */
    private String packageName;
    private String className;
    private String methodName;
    private Object[] methodArgs;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getMethodArgs() {
        return methodArgs;
    }

    public void setMethodArgs(Object[] methodArgs) {
        this.methodArgs = methodArgs;
    }
}
