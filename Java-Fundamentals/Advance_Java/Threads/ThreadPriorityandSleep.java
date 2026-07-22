class H1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(10);//this sleep method throws a checked exception so it is necessary to handle it
            }
             catch (InterruptedException e) {
                e.printStackTrace();
            } 
            
        }
    }
}

class B1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);//this sleep method throws a checked exception so it is necessary to handle it
            }
             catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
}

public class ThreadPriorityandSleep {
    public static void main(String args[]) {
        H1 obj1 = new H1();
        B1 obj2 = new B1();

        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
/*NOTE:-
 Concept of Thread Priority;-
 the thread is sent to the CPU based on its importance if its important than it is prioritized
 
 the range of priority is:- 1(Lowest) - 10(Highest)  amd 5 (Default Priority)
 also different schedulers have different algorithms on the basis of which they set proprity of a thread
 by themselves like Which will take less time to execute etc. 
 using priority we can just suggest the scheduler 
 
 .setPriority() is used to set the priority of a thread
 .getPriority() is used to get the priority of a thread

 sleep() method is used to get a thread into waiting stage so that other thread can execute 
 */
