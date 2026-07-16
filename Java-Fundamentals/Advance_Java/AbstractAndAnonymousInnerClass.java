abstract class A2 {
    public abstract void show(); 
    public abstract void config();
}

public class AbstractAndAnonymousInnerClass {
     public static void main(String args[]) {
        A2 obj = new A2(){
            public void show() {
                System.out.println("In new show");
            }
            public void config(){
                System.out.println("In Config ");
            }
        };
        obj.show();
        obj.config();
    }
}
//Note:- We Already Know we Cannot create the object of Abstract class but in Main Method 
// we might be thinking why are we able to make the object so ,
// POINT TO REMEBER its not the object of A2 its the object of Anonymous Inner class defined inside Main 
//Also we can have multiple methods in the Anonymous inner class