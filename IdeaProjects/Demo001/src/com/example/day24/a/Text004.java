package com.example.day24.a;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {

        int i = 0;

        int sum = 0;

        while (i <= 10) {//10以内

            i++;

            if (i % 2 != 0){
                //偶数
                continue;
            }



            sum += i;//求和

        }

        System.out.println(sum);

    }

}

