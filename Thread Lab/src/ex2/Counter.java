package ex2;

/**
 * Created by g00291410 on 24/09/2015.
 */
public class Counter{

    long count = 0;

    public  void add(long value){
        this.count += value;
        System.out.println(value);
        System.out.println(count);
    }
}
