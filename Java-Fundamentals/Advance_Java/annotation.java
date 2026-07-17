//@Deprecated //This Annotations means We can use it but dont use it.

class X8{
    
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in X8 Show");
    }
}
class Y8 extends X8{

    @Override //This Helps in Debugging at Compile time 
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in Y8 show ");
    }
} 
public class annotation {
    public static void main(String args[]){
        Y8 obj = new Y8();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
//BUGS:- Bugs Are logical problems where we expect something else but we get something else from it