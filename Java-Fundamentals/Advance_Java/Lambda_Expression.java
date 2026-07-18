@FunctionalInterface
interface A4 {
   // void show(int i);

   int add(int i,int j);
}

public class Lambda_Expression {
    public static void main(String args[]) 
    {   /*WITHOUT LAMDA EXPRESSION 
         A4 obj = new A4() {
            public int add(int i , int j){
                return i+j;
            }
        };
        int result = obj.add(5,4);
        System.out.println(result);
        */

       //With Lamda Expression
       A4 obj = (i , j) ->
       {
            return i+j;
       };
       int result = obj.add(5,4);
        System.out.println(result);

//NOTE when ever we have a 1 statement and that staement is of a return type we cannot write return so we remove it 
//EXAMPLE:-  A obj = (int i,int j) -> return i+j or simply write i+j which naturally becomes return when we have a sigle statemnt 
//can also be writtern as A4 obj = (i , j) -> i+j;


        // A4 obj =i -> System.out.println("in show " + i); // lamda expression
        // obj.show(5);
    }
}
// lamda Expressions Reduce the no. of lines and only works with a functional interface 
// A4 obj = new A4() still exist behind the scene ,lamda expression just reduce the code