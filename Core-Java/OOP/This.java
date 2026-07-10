class Human{
    private int age; 
    private String name; 

    public int getAge(){ 
        return age;
    }
    public void setAge(int age){
        this.age = age; //this is used to represent the current object the one calling the method setAge()
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class This {
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
