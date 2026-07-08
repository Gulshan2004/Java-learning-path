class Mobile{
    //Instance Variable
    String brand;
    int price;
    String network;
    static String name; // Static variable belongs to the class not to the object 
    // By Assigning a Variable as Static it becomes common to all the obeject created in the main method.
    // i.e it becomes shareable and if we somwhow change its value for one object it can affect other objects as well .
    // to Use a Static variable Always use the Class Name Itself 

    public void show(){
        System.out.println(brand + ": " + price + " : " + name);
    }
}
public class Static_Variable {
    public static void main(String args[]){
        Mobile obj1 =new Mobile();
        obj1.brand ="Apple";
        obj1.price = 15000;
        Mobile.name= "SmartPhone";

        Mobile obj2 =new Mobile();
        obj2.brand ="Samsung";
        obj2.price = 140000;
        Mobile.name= "SmartPhone";

        obj1.show();
        obj2.show();
    }
}
