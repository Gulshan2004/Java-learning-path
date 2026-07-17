class  A7 extends Object{
    public A7(){
        super();
        System.out.println("In A7");
    }
    public A7(int n){
        super();
        System.out.println("In A7 int");
    }
}

class B7 extends A7{ 
    public B7(){
        super(5);
        System.out.println("In B7");
    }
    public B7(int n){
        super(n); //To Get the Value of Parameterized constructor of the base class we need to pass the parameter in super method of the derived class parameterized constructor.
        //Provided paratmeter is passed with the object in the main method line 25.
        System.out.println("In B7 int");
    }
}
public class ThisAndSuper {
    public static void main(String args[]){
     //B7 obj = new B7(5); // This Will Print the Non-Paramaterized constructor of Base class and then Parameterized constructor of Derived Class.

    
    // B7 obj = new B7(); //it Will Give the Non Parametrized constructor of Base class and then Dervived class  

    }
}

//super() Method executes the constructor of super/base  class;
//NOTE = super() is  default method that comes with  every constructor its there always even if we dont mention it . 
//if we want to acess a parametrized constructor of the base class then we need to use super(patramenter name)  explicilty .

//whenver we create an object of a base class it will call the constructor of   base class first  and then derived class  baseed on the condition it passed with .

//NOTE: EVERY CLASS IN  JAVA EXTENDS Object Class its there even if we dont see it. 
// As we mentioned that super() is a also by default with the constructor so it basically calls the constructor of the base class and
//  if we  mention super() in the base class constructor then it calls the constructor of object class  .



//this() Mehtod is used to execute the constructor of the sane class .
//NOTE: If we want to execute both the constructor of the derived class we use the this() method example is as follows:
// class B7 extends A7{ 
//     public B7(){
//         super(5);
//         System.out.println("In B7");
//     }
//     public B7(int n){
//         this(); 
//         System.out.println("In B7 int");
//     }
// }

// NOTE: this() method will execute the default constructor of the same  class and 
// the default construcotr will execute the default constructor of base class and the final output will be:
/*  OUTPUT:-
In A7
In B7
In B7 int
*/