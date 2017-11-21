package com.aabby.jvm;

/**
 * 栈溢出
 * Created by zhanggl on 2017/11/21.
 */
public class SOFTest {

    public void stackOverFlowMethod() {
        stackOverFlowMethod();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    SOFTest sofTest = new SOFTest();
                    sofTest.stackOverFlowMethod();
                    System.out.println("============================");
                }
            });
            t.start();
        }

    }
}
