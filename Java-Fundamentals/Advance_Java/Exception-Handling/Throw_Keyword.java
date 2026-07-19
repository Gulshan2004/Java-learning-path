public class Throw_Keyword{
     public static void main(String args[]) {
        int i = 0;
        int j = 0;
       
        try {
            j = 18 / i;
          if(j==0)
               throw new ArithmeticException(); // new ArithmeticException() is the object and throw is used to create an exception and throw it  and catch will catch it
        }
         catch (ArithmeticException e) {
            j=18/1;
            System.out.println("Thats a default output is " + e );
            // System.out.println("Cannot divide by zero");
        } 
       
        catch(java.lang.Exception e){
            System.out.println("Something went wrong"+ e);//null pointer exception cuz str is null 
        }
        System.out.println(j);
        System.out.println("sorry");
    }
}
