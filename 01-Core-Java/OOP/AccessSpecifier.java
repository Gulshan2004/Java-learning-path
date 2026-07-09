import other.B;
//import other.Animal;
// class C extends Animal{
//       public static void main(String args[]) {

//         C d = new C();

//         d.eat();     //output: Eating 
//          C is a Child class and protected allows child classes to use the parents proected member.
//     }
// }
public class AccessSpecifier {
    public static void main(String[] args) {
        B obj =new B();
        obj.show();// marks of B is accessible only inside the same class OUTPUT :95;
        //System.out.println(obj.marks); //will through error as marks has a pricate access in B only the class B can access it .

        
    }
}

//NOTE:- If we want something to be accessed outside the package we need to make it public

/*NOTE:-
                                PUBLIC          PRIVATE     PROTECTED     DEFAULT
 SAME CLASS                       YES            YES         YES            YES
 SAME PACKAGE                     YES            NO          YES            YES
 DIFFERENT PACKAGE SUBCLASS       YES            NO          YES            NO
 DIFFERENT PACKAGE                YES            NO          NO             NO 
 */

 //ALways try to make your classes public 
 // try to keep the instance variable private 
 // the method will be public most of the time 