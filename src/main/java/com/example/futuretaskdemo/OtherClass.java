package com.example.futuretaskdemo;

public class OtherClass {
  private int num1;
  private int num2;
  private static String name;

    public OtherClass(int num1, int num2,String piss) {
        this.num1 = num1;
        this.num2 = num2;
        this.name=piss;
    }

    public static void hello() {
        System.out.println(name);
    }

    public void getTotal(){
       System.out.println("Total is :"+num1+num2);
   }
}
