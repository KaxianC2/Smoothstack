package Day4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
public class ProducerConsumerExample {
    final static Lock l = new ReentrantLock();
    final static Condition notFull = l.newCondition();
    final static Condition notEmpty = l.newCondition();
    
    static int[] buf = new int[10];
    static volatile int count = 0;
    public static void main(String[] args) {
        Thread prod = new Thread(new Producer());
        Thread cons = new Thread(new Consumer());

        prod.start();
        cons.start();
    }

    private static class Producer implements Runnable{
        public void run(){
            System.out.println("Producing stuff");
                for(int i = 0; i< 50;i++)
                {
                    produce();
                }
            System.out.println("Done producing stuff");
        }
        private void produce(){
            try {
                l.lock();
                while(buf.length==count){
                    notFull.await();
                }
                buf[count]=1;
                count++;
                System.out.println(count);
                notEmpty.signal();
            } catch (Exception e) {
                System.out.println(e);
            }finally{
                l.unlock();
            }
        }
    }

    private static class Consumer implements Runnable{
        public void run(){
            System.out.println("Consuming stuff");
                for(int i = 0; i< 50;i++)
                {
                    consume();
                }
            System.out.println("Done Consuming stuff");
        }
        private void consume(){
            try {
                l.lock();
                while(count==0){
                    notEmpty.await();
                }
                count--;
                System.out.println(count);
                buf[count]=0;
                notFull.signal();
            } catch (Exception e) {
                System.out.println(e);
            }finally{
                l.unlock();
            }
        }
    }

}
