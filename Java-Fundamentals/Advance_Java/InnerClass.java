class G{
    int age;
    public void show(){
        System.out.println("In show");
    }
    class H{
        public void config(){
            System.out.println("In Config");
        }
    }
}
public class InnerClass {
    public static void main(String args[]){
        G obj = new G();
        obj.show();

        G.H obj1 =obj.new H();//To create an object of the inner class we need to specify  where it belongs to (H belong to G i.e G.H)  and object 0f outer class "obj" in this case 
        obj1.config();
    }
}

//NOTE: We can Make a Inner class as static .
// We cannot make an Outer class Static.
// doing So "Static Class H { ...}"  Now to call its Method we use the Object with the synatax G.H obj1 = new G.H()