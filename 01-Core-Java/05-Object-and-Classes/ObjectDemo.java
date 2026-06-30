class calculator{
    int a; //variable

    public int add(int n1,int n2){ //method
        int r =n1 + n2;
        return r;
    }
}
public class ObjectDemo {
    public static void main(String args[]){
        int num1 =4;
        int num2=5;
        calculator calc = new calculator(); //class_name_type  reference variable = object 

        int result = calc.add(num1,num2);
        // System.out.print("Result: " + (num1+num2));
        System.out.println(result);
    }
}
//Object oriented programming
// Object has properties and behaviours
//Class 