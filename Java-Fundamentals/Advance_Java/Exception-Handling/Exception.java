
public class Exception {
    public static void main(String args[]) {
        int i = 0;
        int j=0;
        try {
            j = 18 / i;
        } catch (java.lang.Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j); 
        System.out.println("sorry");
    }
}
/*NOTE:- 
int i =0;
int j =18/i;
System.out.println(j);  // This creates exception due to which the rest of the program stops thats why
                        // it is important to handle exeception so that programm dont stop unexectedly
                        // to avoid such scenerios we use the concept of exception handling 

try{} contains the code that may throw the exception 
catch(){} if the code in the try block causes exception than it goes through the  catch block where the exception is thrwon to the user 
otherwise catch is skipped .
the rest of the programm remains unaffected due to try and catch .
 */