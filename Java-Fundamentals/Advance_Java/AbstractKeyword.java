abstract class Car{
    // to declare a method we use abstract keyword with it
    // we always write a abstract method in an abtract class only   
    // It is not compulsory for a abstract class to have abstract methods 
    // Abstract class can have abstarct methods as well as normal methods
    public abstract void drive(); 
    public abstract void fly();
    
    public void playMusic(){
        System.out.println("Play Music");
    }
}
abstract class WagonR extends Car{ 
    //If We Have a Class That is not able to implement all the Methods it Becomes abstract as well 
    // note if we extending an abstract class we need to define it 
    public void drive(){
        System.out.println("Driving..");
    }
    // public void fly(){
    //     System.out.println("Flying..");
    // }
}
class UpdatedWagonR extends WagonR{ //CONCRETE CLASS 
    public void fly() {
      System.out.println("Flying..");
    }

}
public class AbstractKeyword {
    public static void main(String args[]){

    //Car obj = new Car();// we cannot create an object of the abstract class
    //Car obj = new WagonR();// we can create a reference of abstract class
    Car obj = new UpdatedWagonR();
    obj.drive();
    obj.fly();
    obj.playMusic();
    
    }
}
