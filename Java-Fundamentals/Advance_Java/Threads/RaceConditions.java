class Counter{
    int count; //instance varioable by default value is 0.
    public synchronized void increment(){//The synchronized keyword is used to emsure that the incement will bw called by one thread at a time and avoid race conditions.
        count++;
    }
}
public class RaceConditions {
    public static void main(String args[]) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 =()-> 
        {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
        };
        Runnable obj2 =  ()->
        {
                for (int i = 1; i <= 1000; i++) {
                   c.increment();
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join(); //join() is a special method which allows your main method to come back after waiting and join and it throws a checked exception so it need to be handeld thats why we used the throws keyword in the main signature.
        t2.join();

        System.out.println(c.count);
    }
}
/*NOTE:-
 Mutation:- Means we can change something
 Threads and Mutation cannot be used together thats why  if we are working with threads
 always work with immutable data OR if  there is a method wich can do some mutation always male it thread safe 
 
 Thread Safe:-
 only one thread can work with a data at a time 
 means suppose if t1 and t2 are threads and there is a method show()*
 if t1 is working with show() t2 cannot and vice versa
 */