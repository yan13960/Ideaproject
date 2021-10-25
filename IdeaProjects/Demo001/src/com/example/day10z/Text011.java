package com.example.day10z;

/**
 *
 */
public class Text011 {public static void main(String[] args) {
      /*  while (true){
            System.out.println("死循环 ");
        }*/

      int i=1;
      while (i<=100){
          System.out.println(i);
          //注意不要忘记加i++否则变成死 循环
          i++;
      }

     /*for (int i=0;i<10;i++){
         System.out.println(i);
     }*/

    /* for (;;){
         System.out.println("死循环");
     }*/
       /* int i=0;
        for (;i<10;){
            System.out.println(i);
            i++;
        }*/
/*
    for (int i=0,j=1,c=1;i<10;i++){//可以有多个变量
        System.out.println(i);
    }*/
}
}
