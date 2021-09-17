package day4;
/**
 * Assignment 2 - this program causes a deadlock between two threads using locks.
 * @author Kaxian Situ
 */
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
public class Deadlock {
    public static Lock l1 = new ReentrantLock();
    public static Lock l2 = new ReentrantLock();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }

    private static class Thread1 implements Runnable{
        public void run(){
            l1.lock();
            System.out.println("in thread1.");
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("in thread1 exception");

            }
            l2.lock();
            System.out.println("in thread1. have lock 1 and 2");
        }
    }
    private static class Thread2 implements Runnable{
        public void run(){
            l2.lock();
            System.out.println("in thread2.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("in thread2 exception");
            }
            l1.lock();
            System.out.println("in thread2. have lock 1 and 2");

        }
    }
}
