class GulshanException extends java.lang.Exception {
    public GulshanException(String string) {
        super(string);
    }
}

public class CustomException {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new GulshanException("I dont want to print zero");
        } catch (GulshanException e) {
            j = 18 / 1;
            System.out.println("Thats a default output is " + e);
        }

        catch (java.lang.Exception e) {
            System.out.println("Something went wrong" + e);// null pointer exception cuz str is null
        }
        System.out.println(j);
        System.out.println("sorry");
    }
}
/*We can create our own exceptions in java for doing this we need to make 
a class with the exception like GulshanException and this Exeption class need to extend Exception/Runtime Exception class itself
and if we are accepting a message then we need to pass the message to the exception class constructor along with super(String string)  )  */