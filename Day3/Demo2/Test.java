package com.ff.javathread.Day3.Demo2;

import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        PrintNum p =new PrintNum();
        Thread p1 = new Thread(p);
        Thread p2 = new Thread(p);
        p1.start();
        p2.start();
    }

}
