
// class H2 implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hii");
//             try {
//                 Thread.sleep(10);// this sleep method throws a checked exception so it is necessary to handle it
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B2 implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);// this sleep method throws a checked exception so it is necessary to handle it
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class RunnableVsThread {
    public static void main(String args[]) {
        Runnable obj1 =()-> 
        {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hii");
                    try {
                        Thread.sleep(10);// this sleep method throws a checked exception so it is necessary to handle it
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Runnable obj2 =  ()->
        {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);// this sleep method throws a checked exception so it is necessary to handle it
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
/* NOTE:- 
Thread is a class which implements runnable  
The runnable interface dont have the start() method and it have the run() method
Runnable is a functional intefrace so we can use the lamda expression with this */