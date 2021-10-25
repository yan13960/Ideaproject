package com.example.day14作业.d;

/**
 *
 */
public class ZhuBan extends  Computer {

    public ZhuBan(){
    }
    public ZhuBan(String zname,String cname,String ename,String bname){
        super(cname, ename, bname);
        System.out.println("这是主板类3："+zname);
    }
    public static void main(String[] args) {
        ZhuBan zhuBan=new ZhuBan("主板a","电脑b","电子产品c","品牌d");
    }
}
