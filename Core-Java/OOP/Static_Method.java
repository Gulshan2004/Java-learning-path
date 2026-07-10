class Mob{
    //Instance Variable
    String brand;
    int price;
    String network;
    static String name;

    public void show(){
        System.out.println(brand + ": " + price + " : " + name);
    }
    public static void show1(Mob obj){
        System.out.println(obj.brand + ": " + obj.price + " : " + name);
    }
}
public class Static_Method{
    public static void main(String args []){
        Mob obj1 =new Mob();
        obj1.brand ="Apple";
        obj1.price = 15000;
        Mob.name= "SmartPhone";

        Mob obj2 =new Mob();
        obj2.brand ="Samsung";
        obj2.price = 140000;
        Mob.name= "SmartPhone";

        obj1.show();
        obj2.show();

        Mob.show1(obj1);

    }
}
//Note:- We cannot call a static method with the help of a class name we need to create an object for them 
// But we can call a static method directly with the help of class name 
// We can use  a static variable inside a static method but no non static variable can be used inside static method  directly,
// But it is possible indirectly. by passing the object itself 


/*THE MAIN METHOD IS STATIC WHY ? IF WE DONT MAKE IT STATIC THEN WE WILL NEED TO CRATE AN OBJECT OF THE CLASS Static_Method BUT,
 AS WE KNOW MAIN IS THE STARTING POINT OF EXECUTION THAT MEANS THE PROGRAMMING WILL NEVER START HENCE MAIN IS STATIC. */