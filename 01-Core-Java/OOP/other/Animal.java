package other;

public class Animal {
    protected void eat(){
        System.out.println("Eating");
    }

    public void show(){
        eat();
    }
    //A  class can access its own protected members.
}
