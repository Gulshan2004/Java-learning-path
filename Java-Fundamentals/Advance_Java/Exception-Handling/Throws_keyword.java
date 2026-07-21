class E {
    public void show() throws ClassNotFoundException {// throws says now I wont handle the exception it will be handled by the method who is calling it which is main in this case this is called ducking .
          
        Class.forName("Calc");//here try is not able to find the class Calc so it sents the exception 
       
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
            e.printStackTrace(); //it prints the entire stack like which method is calling whome and we can track the problem
        }
    }
}
//Never write throws with the main method cuz main is handled my jvm and jvm will stop the execution if it handles the exception