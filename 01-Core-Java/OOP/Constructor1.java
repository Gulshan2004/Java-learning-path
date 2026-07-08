class Human{
    private int age;
    private String name; 
    //Constructor  is a Special Method with the same name as the class name and do not have a return type.
    
    public Human(){ // Default  Constructor
        age = 12;
        name = "John";
    }
    public Human(int age, String name){ //Parameterized Constructor
        this.age =age;
        this.name =name;
    }

    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
}
public class Constructor1{
    public static void main(String args[]){
        Human obj =new Human();
        // Every time we create an object we call the constructor 
        Human obj1 = new Human(32, "Gulshan");
        System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj1.getName() + ":" + obj1.getAge());
        //obj.setAge(34);
        //obj.setName("Gulshan");
        //System.out.println(obj.getName() + ":" + obj.getAge());
    }
}

