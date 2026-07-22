class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hii");
        }
    }
}
class Bi extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}
public class Mutiple_Threads {
    public static void main(String args[]){
        Hi obj1 = new Hi();
        Bi obj2 = new Bi();

        //obj1.show(); //here the obj1.show() calls the show of Hi and runs the method for 10 times till this execute the other part of the program remains in the hault state 
        // so in order to achieve a way thru which the othere parts of the program dont hault we use the concept of threads
       // obj2.show();

       obj1.start();
       obj2.start();
    }
}
/*NOTE:- 
we cant execute normal objects in multiple threads simultaneously 
so in order to makes these objects as threads we extend the class with a class called Thread
 
the start() is a method of thread class and every time we call this method it calls the run method
In Every Thread we need to have a run method. 

CONCEPT OF SCHEDULER :
The job of a scheduler is to allow which threads to execute in the OS based on the cors of the CPU
*/