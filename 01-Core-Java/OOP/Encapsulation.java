class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation {
    public static void main(String args[]){
        Human obj =new Human();
        //obj.age =11;
        //obj.name ="Gulshan";
        System.out.println(obj.getName());
    }
}
