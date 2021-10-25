package com.example.day14作业.a;

/**
 *
 */
public class MainBorad extends Computer {
    public String mName;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public static void main(String[] args) {
        MainBorad mainBorad=new MainBorad();
        mainBorad.setmName("111");
        mainBorad.setBname("222");
        mainBorad.setCname("333");
        mainBorad.setEname("444");
        System.out.println(mainBorad.mName);
        System.out.println(mainBorad.bname);
        System.out.println(mainBorad.cname);
        System.out.println(mainBorad.ename);
    }
}
