@FunctionalInterface
interface I{ //SAM single abstract method interface / functional interface as well
    void show();   
}
// class J implements I{
//     public void show(){
//         System.out.println("in show");
//     }
// }
public class Functional_Interface{
    public static void main(String args[]){
        I obj = new I(){ //aAnonymous Inner class
          public void show(){
            System.out.println("in show");
          }  
        };
        obj.show();
    }
}
