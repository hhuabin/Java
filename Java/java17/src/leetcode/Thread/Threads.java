package leetcode.Thread;

/**
 * @author bin
 * @date 2023-07-03-9:29
 */
public class Threads {
    private int n;
    private Integer m = 1;

    public static void main(String[] args) {
        Threads threads = new Threads(3);
        ThreadSale threadSale = new ThreadSale(threads);
        ThreadSale2 threadSale2 = new ThreadSale2(threads);
        ThreadSale3 threadSale3 = new ThreadSale3(threads);

        threadSale.start();
        threadSale2.start();
        threadSale3.start();
    }

    public Threads(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero() throws InterruptedException {
        while(m/2 < n) {
            if(m % 2 == 1) {
                System.out.println(0);
                m++;
                notifyAll();
            } else {
                wait();
            }
        }
    }

    public synchronized void even() throws InterruptedException {
        while(m/2 <= n) {
            if(m % 2 == 0 && (m / 2) % 2 == 0) {
                System.out.println(m / 2);
                m++;
                notifyAll();
            } else {
                wait();
            }
        }
    }

    public synchronized void odd() throws InterruptedException {
        while(m / 2 <= n) {
            if(m % 2 == 0 && (m / 2) % 2 == 1) {
                System.out.println(m / 2);
                m++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
}
