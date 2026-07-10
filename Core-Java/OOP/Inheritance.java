class Calc{
    public int add (int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}

//AdvCalc is an example of Single Level Inheritance
//THIS IS A is a RELATIONSHIP i.e Advance Calculator is a Calculator
class AdvCalc extends Calc{ //We use the extends keyword to inherit the property of base clase i.e Calc into dervived class i.e AdvCalc.
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}

public class Inheritance {
    public static void main(String args[]){
        // calc obj =new  calc();
        AdvCalc obj =new  AdvCalc();
        int r1 =obj.add(2,3);
        int r2 =obj.sub(7,3);
        int r3=obj.multi(7,3);
        int r4 =obj.div(7,3);
        
        System.out.println(r1 + " " + r2 + " " + r3 +" " + r4);
    }
}
