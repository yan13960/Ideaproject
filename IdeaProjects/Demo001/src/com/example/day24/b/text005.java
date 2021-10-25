package com.example.day24.b;

/**
 *
 */
public class text005 {

        int x, y;
        text005(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void bbb(){

            //aaa();
            System.out.println(222);
            //this.aaa();
        }
       public void aaa(){

           this.bbb();

           System.out.println(111);
        }


        public static void main(String[] args) {

            text005     pt1 = new text005(3, 3);
            text005  pt2 = new text005(4, 4);
            pt1.aaa();
            pt1.bbb();
            System.out.print(pt1.x + pt2.x);

            Class C1=Integer.TYPE;
        }
    }

