package com.example.day08作业;

/**
 *
 */
public class Text007 {
    /*public static void main(String[] args) {
            //循环打印1，2，3，4
            for (int i = -1; i < 5; i++) {
                if (i == 1) {//当i等于1的时候
                    break;//跳出当前循环 }
                }
                    System.out.println(i);

            }
        }
    }*/

  /*public static void main(String[] args) {
               go : for (int j = 1; j < 5; j++) {//外层循环别名为go
                      //循环打印1，2，3，4
                      for (int i = 0; i < 5; i++) {
                                if (i == 4) {//当i等于1的时候
                                      break go;//跳出外层循环
                                }
                               System.out.println(i);
                            }

                     }
            }
 }*/

  /*  public static void main(String[] args) {
                 //循环打印1，2，3，4
                for (int i = 0; i < 5; i++) {
                        if (i == 2) {//当i等于1的时候
                               continue;//继续执行外层循环
                            }
                       System.out.print(i);
                    }
            }
 }*/

  public static void main(String[] args) {
        go : for (int j = 0; j <5; j++) {//外层循环别名为go
        //循环打印1，2，3，4
        for (int i = 0; i < 5; i++) {
        if (i == 4) {//当i等于1的时候
        continue go;//继续执行外层循环
        }
        System.out.print(i);
        }
        System.out.println();//不会执行到
        }
      System.out.println();
        }
        }