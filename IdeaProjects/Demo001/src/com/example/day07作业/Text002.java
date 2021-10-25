package com.example.day07作业;

import java.util.Scanner;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        System.out.println("登录菜单：");
        Scanner inPut=new Scanner(System.in);
        int num=inPut.nextInt();
        switch (num){
            case 1:
                System.out.println("1：登录系统");
                Scanner inPut1=new Scanner(System.in);
                int num1=inPut1.nextInt();
                if (num1==1){
                    System.out.println("1：客户信息管理");
                    Scanner inPut2=new Scanner(System.in);
                    int num2=inPut2.nextInt();
                    switch (num2){
                        case 1:
                            System.out.println("购物管理系统>客户信息管理");
                            System.out.println("1：显示所有客户信息");
                            break;
                        case 2:
                            System.out.println("购物管理系统>客户信息管理");
                            System.out.println("2：添加客户信息");
                            break;
                        case 3:
                            System.out.println("购物管理系统>客户信息管理");
                            System.out.println("3：修改客户信息");
                            break;
                        default:
                            System.out.println("购物管理系统>客户信息管理");
                            System.out.println("4：查询客户信息");
                    }
                }else if (num1==2){
                    System.out.println("2：购物结算");
                }else if (num1==3){
                    System.out.println("3：真情回馈");
                    Scanner inPut3=new Scanner(System.in);
                    int num3=inPut3.nextInt();
                    switch (num3){
                        case 1:
                            System.out.println("购物管理系统>真情回馈");
                            System.out.println("1：幸运大放送");
                            break;
                        case 2:
                            System.out.println("购物管理系统>真情回馈");
                            System.out.println("2：幸运抽奖");
                            break;
                        default:
                            System.out.println("购物管理系统>真情回馈");
                            System.out.println("3：生日问候");
                    }
                }else{
                    System.out.println("4：注销");
                } default:
                System.out.println("2：退出");
                break;
        }
    }
}
