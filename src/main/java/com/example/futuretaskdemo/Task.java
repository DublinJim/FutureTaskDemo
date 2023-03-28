package com.example.futuretaskdemo;

public class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("counting to "+i+" Thread is "+ Thread.currentThread().getName() );

        }

    }
}
