package leetcode.Thread;

import leetcode.Thread.Threads;

/**
 * @author bin
 * @date 2023-07-03-10:07
 */
public class ThreadSale3 extends Thread {

    Threads threads;

    public ThreadSale3(Threads threads) {
        super();
        this.threads = threads;
    }

    public void run() {
        try {
            threads.odd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
