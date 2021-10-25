package com.example.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 */
public class Text13 {
    public static void main(String[] args) throws IOException {
        //代码看不懂没关系，我是讲异常
        File file = new File("F:\\1111");
        FileInputStream fis= new FileInputStream(file);
        fis.close();
    }
}
