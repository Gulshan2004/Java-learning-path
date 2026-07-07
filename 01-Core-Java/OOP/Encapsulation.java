class Human{
    private int age; //default 0
    private String name; // default Null

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String b){
        name = b;
    }
}
public class Encapsulation {
    public static void main(String args[]){
        Human obj =new Human();
        obj.setAge(34);
        obj.setName("Gulshan");
        //obj.age =11;
        //obj.name ="Gulshan";
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
