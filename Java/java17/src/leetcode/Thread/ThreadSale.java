package leetcode.Thread;

import leetcode.Thread.Threads;

/**
 * @author bin
 * @date 2023-07-03-9:33
 */
public class ThreadSale extends Thread {

    Threads threads;

    public ThreadSale(Threads threads) {
        super();
        this.threads = threads;
    }

    public void run() {
        try {
            threads.zero();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

