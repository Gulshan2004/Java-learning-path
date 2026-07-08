class A{
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("In A show");
    }
}
public class AnonymousObject {
    public static void main(String args[]){
         new A(); // Anonymouhs Object ie object with no name and these objects cannot be reused
         new A().show(); //method calling using anonymous object
    }
}


