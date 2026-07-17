enum Laptop { //Laptop is a Class here .
    Macbook(2000) ,XPS(2200), Surface, ThinkPad(1800); //these are the objects of Laptop with each object having different value for price
    
    private int price ;
    
    private Laptop(){
        price =500;
    }
    private Laptop(int price) { //constructor for laptop
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String args[]) {
        // Status s = Status.Success;
        // System.out.println(s.getClass().getSuperclass());

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + ":" + lap.getPrice());

        //Wht if we want to get all the laptops
        
        for (Laptop lap: Laptop.values()){ //
            System.out.println(lap + ":" + lap.getPrice());
        }

    }
}
// NOTE:- You cannot  Extend Enum in Any Other Class 
// By default Enum in java Extends the Enum Class 
//values() method allows you to retrieve an array of all enum constants in the order they are declared.