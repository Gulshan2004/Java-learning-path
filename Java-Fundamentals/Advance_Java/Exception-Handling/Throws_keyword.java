class E {
    public void show() throws ClassNotFoundException {// throws says now i wont handle the exception it will be handles by someone else which is the main method
        // try {
            Class.forName("Calc");// try is not able to find the class Calc so it sents the exception to the catch block
        // } 
        // catch (ClassNotFoundException e) {
        //     System.out.println("Not Able to find the class ");
        // }
    }
}

public class Throws_keyword {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String args[] ) {
        E obj = new E();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
