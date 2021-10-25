package com.example.day19;

/**
 *
 */
public class User {
    private  String sex;

    public String getSex() {
        return sex;
    }
    //throws  Exception 方法声名，我这个方法可能有错误
    //throw 必需配合 throws一起使用
    //throws 可以单独使用

    public void setSex(String sex) throws  Exception{
        if (sex.equals("女")||"男".equals(sex)) {
            this.sex = sex;
        }else
        //如果结果不正常我就手动抛异常，友好提示
        throw  new Exception("性别必需为 男 或女");
    }

}
