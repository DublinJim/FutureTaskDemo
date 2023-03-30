package com.example.futuretaskdemo;

public class Task implements Runnable {

    public int num1=2;
    public int num2=4;
    public int total;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("counting to "+i+" Thread is "+ Thread.currentThread().getName() );

        }

    }

    public int getTotal()
    {
        total=num1+num2;
        return total;
    }


}
