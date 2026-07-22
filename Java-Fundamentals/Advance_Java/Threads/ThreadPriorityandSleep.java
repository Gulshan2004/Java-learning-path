class H1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hii");
        }
    }
}

class B1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class ThreadPriorityandSleep {
    public static void main(String args[]) {
        H1 obj1 = new H1();
        B1 obj2 = new B1();

        obj1.start();
        obj2.start();
    }
}
