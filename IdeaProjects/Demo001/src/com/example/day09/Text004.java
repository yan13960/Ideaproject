package com.example.day09;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {

        //求1...10 的   奇数   1  3  5  7  ....
      /*  for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }*/


        //求1...10 的   偶数数 2  4  6...
        int count=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
                count+=i;  // 相当于 count=count+i;
            }
        }
        System.out.println(count);
    }
}
