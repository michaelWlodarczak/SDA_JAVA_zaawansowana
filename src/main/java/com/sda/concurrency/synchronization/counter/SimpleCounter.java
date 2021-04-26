package com.sda.concurrency.threads;

public class SimpleCounter {
    private int value = 0;

    private synchronized void increment(){
        ++value;
    }
    private synchronized void decrement(){
        --value;
    }

    public int getValue() {
        return value;
    }
}
