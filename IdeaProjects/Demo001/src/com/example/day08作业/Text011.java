package com.example.day08作业;

/**
 *
 */
public class Text011 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println("");
        }
    }
}
   /*public static void main(String[] args) {
       int var=9;
       for (int i=0,j=var;i<=var;i++,j--){
           System.out.println(i+"+"+j+"="+(i+j));
       }
   }
}*/
  /* public static void main(String[] args) {
       outer:
       for (int i = 1; i <= 9; i++) {
           for (int j = 1; j <= i; j++) {
               if (i >= 5) {
                   break outer;
               }
               System.out.println(j + "*" + i + "=" + (j * i) + "\t");
           }
           System.out.println("");
       }
   }
}*/
