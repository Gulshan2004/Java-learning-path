class X{
    public void show1(){
        System.out.println("in X show");
    }
}
class Y extends X{
     public void show2(){
        System.out.println("in Y show");
    }
}
public record Up_Down_Casting() {
    public static void main(String args[]){
        // double d=4.5;
        // int i =(int)d; typecasting

        X obj =(X) new Y();//Up Casting 
        obj.show1();
       
        //obj.show2();// Even if the object is of Y we cannot call the method show2() of Y because the reference is of X and X has no idea wht is show2() 
        //To solve this problem we use Down Casting 
        Y obj1 = (Y)obj; // Down Casting 
        obj1.show2(); //to call the method show2() of Y we need to type cast the  object obj of X to  type Y  cuz the reference was Of X , this process follows top down approach and is ternmed as downcasting. 
    }
}
