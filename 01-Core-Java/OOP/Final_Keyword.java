//Final keyword can be used with a - Variable , method , class.

//FINAL CLASS
// final class  Calculator{ // if we assign a class as final we stop its inheritance in derived classes .
//     public void show(){
//         System.out.println("In Calculator Show");
//     }
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }
// class AdvCalculator extends Calculator{ //ERROR

// }

//FINAL METHOD:-
// class  Calculator{ 
//     public final void show(){ // If we assign a method as final we stop it from overriding it in the subclases .
//         System.out.println("By Gulshan");
//     }
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }
// class AdvCalculator extends Calculator{
//     public void show(){ //Error
//         System.out.println("By Jhon");
//     }
// }

public class Final_Keyword {
    public static void main(String args[]){
        //FINAL VARIABLE 
        //final int num = 8; if we assign a variable as final than it becomes constants and we can change the value of it .
        //System.out.println(num);

        //FINAL CLASS:-
        // Calculator obj = new Calculator();
        // obj.show();
        // obj.add(4,5);
        
    }
}
