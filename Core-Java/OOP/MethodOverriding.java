class Calc{
    public int add(int n1 , int n2){
        return n1+ n2;
    }

}
class AdvCalc extends Calc{
    public int add(int n1 , int n2){ // This is Called Method Overriding where add() of AdvCalc class overrids the add() of Calc class
        return n1 + n2+ 1;
    }
 }
public class MethodOverriding {
    public static void main(String args[]){
        AdvCalc obj =new AdvCalc();
        int r1 =obj.add(2,4);
        System.out.println(r1);
    
    }
}
