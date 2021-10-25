package com.cold.module.util;

import com.cold.module.anno.RpcClazz;
import com.cold.module.anno.RpcMethod;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class AnnotationUtil {

    public static Map<String, List<Map<String,List<String>>>> parseAnnotation(String packageName) throws ClassNotFoundException {
        Map<String, List<Map<String,List<String>>>> map=new HashMap<String, List<Map<String, List<String>>>>();
        String  basePath= AnnotationUtil.class.getResource("/").getPath();
        String packagePath = packageName.replace(".", "/");
        File file = new File(basePath + packagePath);
        String[] names = file.list();
        for (String name : names) {
            name=name.replaceAll(".class","");
            Class<?> clazz = Class.forName(packageName + "." + name);
            if (clazz.isAnnotationPresent(RpcClazz.class)){
                Method[] declaredMethods=clazz.getDeclaredMethods();
                List<Map<String,List<String>>> methods=new ArrayList<Map<String, List<String>>>();
                for (Method declaredMethod : declaredMethods) {
                    if (declaredMethod.isAnnotationPresent(RpcMethod.class)) {
                        Map<String,List<String>> method =new HashMap<String, List<String>>();
                        List<String> args =new ArrayList<String>();
                        Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                        for (Class<?> parameterType : parameterTypes) {
                            String simpleName = parameterType.getSimpleName();
                            args.add(simpleName);
                        }
                        method.put(declaredMethod.getName(),args);
                        methods.add(method);
                    }
                }
                map.put(packageName+"."+name,methods);
            }
        }
        return map;

    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(AnnotationUtil.parseAnnotation("com.cold.module.controller"));
    }
}
