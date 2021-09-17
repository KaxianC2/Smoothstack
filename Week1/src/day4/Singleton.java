package Day4;
/**
 * Assignment 1- this class is an implementation of a double checking locking singleton
 */
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
public class Singleton {
    private static volatile Singleton single=null;
    private static Lock x = new ReentrantLock();
    private Singleton(){
        //init stuff
    }

    public Singleton getInstance(){
        if(single==null)
        {
            x.lock();
            if(single==null){
                single = new Singleton();
            }
            x.unlock();
        }
        return single;
    }
}
