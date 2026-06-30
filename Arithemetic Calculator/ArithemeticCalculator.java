public class ArithemeticCalculator{
    public static void main(String args[]){
        double num1=7;
        double num2=3;
        char operator ='+';
        String again ="y";
        while(again.equals("y")){
            if(operator == '+'){
                System.out.println("Addition: " + (num1 +num2));
            }
            else if(operator == '-'){
                System.out.println("Subtraction: "+ (num1-num2));
            }
            else if(operator == '*'){
                System.out.println("Multiplication " + (num1*num2));
            }
            else if(operator == '/'){
                if(num2==0){
                System.out.println( "cannot divide by zero");
                }
                else{
                    System.out.println("Division: " + (num1/num2));
                }
            }
            else{
                System.out.println("Please enter a valid number");
            }
            again ="n";
        }
            System.out.println("THANK YOU FOR USING THE CALCULATOR");
    }
}