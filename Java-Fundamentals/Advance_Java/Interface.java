interface A3{
    int age=32; //All the Variables inside the Interface are by default FINAL and STATIC
    String area="Mumbai";

    void show();
    void config();
    
}
interface X3{
    void run();
}
interface Y3 extends X3{ //interfaces can be inherited using the extends keyword
    void run();
}
class B3 implements A3,Y3{ // to implement the methods of  interfaces we use the implements keyword.
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println(" running.. ");
    }
}
public class Interface {
    public static void main( String args[]){
        A3 obj=new B3();
        obj.show();
        obj.config();

        X3 obj1 = new B3();
        obj1.run();

       // A3.area ="Delhi"; since the variable area is final it cannot be reassigned
        System.out.println(A3.area);
    }
}
//NOTE:- An Interace is not a Class and Bydefault every method is public abstract
// we make a innterface to design something 
// we dont intantiate an Interface 
//Interface dont have there own memory in the heap so thats why we created the object of B3 instead of A3.
//In INterfaces we can have a class implementing multiple interfaces

//class - class -> extends 
//class -interface -> implements 
//Interface -Interface -> extends