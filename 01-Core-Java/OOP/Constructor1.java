class Human{
    private int age;
    private String name; 

    public Human(){ // Constructor It is a Special Method with the same name as the class name and do not have a return type.
        age = 12;
        name = "John";
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class Constructor1{
    public static void main(String args[]){
        Human obj =new Human();
        // Every time we create an object we call the constructor 
        System.out.println(obj.getName() + ":" + obj.getAge());
        //obj.setAge(34);
        //obj.setName("Gulshan");
        //System.out.println(obj.getName() + ":" + obj.getAge());
    }
}

