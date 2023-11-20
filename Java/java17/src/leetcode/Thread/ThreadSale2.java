package leetcode.Thread;

import leetcode.Thread.Threads;

/**
 * @author bin
 * @date 2023-07-03-10:06
 */
public class ThreadSale2 extends Thread {

    Threads threads;

    public ThreadSale2(Threads threads) {
        super();
        this.threads = threads;
    }

    public void run() {
        try {
            threads.even();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}