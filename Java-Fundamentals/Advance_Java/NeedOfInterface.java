interface  Computer{
     public void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code , compile , run");
    }
}
class Desktop implements  Computer{
    public void code(){
        System.out.println("Code , compile , run:Faster");
    }
}
class Developer{
    public void devApp(Computer lap){ 
        lap.code(); //when we call code it will be called on the basis of wht object we are passing through the main method which is desk in this case not lap as its refeerence is Coputer 
        }
}
public class NeedOfInterface{
    public static void main(String args[]){
       // Computer lap = new Laptop(); // we can make the reference of parent Interface and the object of child class
        Computer desk = new Desktop();
        Developer gulshan = new Developer();
        gulshan.devApp(desk);
        //gulshan.devApp(desk); // We cannot pass the desk object becuase if the developer class only accepts laptop 
    }
}
