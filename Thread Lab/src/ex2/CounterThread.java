package ex2;

/**
 * Created by g00291410 on 24/09/2015.
 */
public class CounterThread extends Thread{

    protected Counter counter = null;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    public void run() {
        for(int i=0; i<10; i++){
            counter.add(i);
            System.out.println(getName());
        }

    }
}
