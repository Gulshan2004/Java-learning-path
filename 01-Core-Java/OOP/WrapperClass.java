public class WrapperClass {
    public static void main(String args[]){
        int num =7;
       // Integer num1 = new Integer(num);//boxing (getting a value from primitive type to object type) [MANUAL]
        Integer num1 = num; //auto-boxing 

        //int num2 =num1.intValue(); // unboxing ( getting a value from object type to a primitive type ) [MANUAL]
        int num2 =num1; //auto-unboxing
        System.out.println(num2);

        String str = "12";
        int num3= Integer.parseInt(str);
        System.out.println(num3*2);
    }
}

//for Every Primitive type in java we have a class for it and this class is referred as Wrapper class.