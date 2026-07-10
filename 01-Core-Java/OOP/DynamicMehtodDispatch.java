class P {
    public void show() {
        System.out.println("in A show");
    }
}

class Q extends P {
    public void show() {
        System.out.println("in B show");
    }
}

class R extends P {
    public void show() {
        System.out.println("in C show");
    }
}

public class DynamicMehtodDispatch {
    public static void main(String args[]) {
        // P obj =new Q(); // obj type is P but the implementation is Q this also works
        // the same as Q obj = new Q(); as Q extends P
        // So yes it is possibe to create the reference of super class and object of
        // subclass .

        P obj = new P();
        obj.show();

        obj = new Q();
        obj.show();

        obj = new R();
        obj.show();

        // here the same object is behaving differently with different objects this is
        // polymorphism
        // at compile time we are not sure that obj.show() will call method of which
        // class it will be decide at runtime this is called run time polymorphism
        // And this concept is called DYNAIMIC METHOD DISPATCH
        //works only in inheritance.

    }
}