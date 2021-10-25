package com.example.day16作业.a;

import com.example.day16作业.b.BlackBox;

/**
 *
 */

public class Text001 {
    public static void main(String[] args) {
        BlcakWhite blcakWhite=new BlcakWhite();
        Person person=new Person();
        person.use(blcakWhite);
        blcakWhite.run();


       Colours colours=new Colours();
       Person person1=new Person();
       person1.use(colours);
       colours.run();

      Printer printer=new Colours();
      person1.use(printer);
      printer.run();

      Printer printer1=new BlcakWhite();
      person.use(printer1);
      printer1.run();


    }
}