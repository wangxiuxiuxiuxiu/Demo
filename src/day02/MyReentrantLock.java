package day02;

import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock {

    public static void main(String[] args) {


        ReentrantLock lock = new ReentrantLock(false);
        lock.lock();

    }
}
