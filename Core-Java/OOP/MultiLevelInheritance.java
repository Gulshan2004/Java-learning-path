class Calc3{
    public int add (int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}

class AdvCalc3 extends Calc3{ //We use the extends keyword to inherit the property of base clase i.e Calc into dervived class i.e AdvCalc.
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}

class ScifiCal extends AdvCalc3{ // This is an Example of Multi Level Inheritance where AdvCalc extends Calc and ScifiCal Extends AdvCalc.
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}

public class MultiLevelInheritance {
    public static void main(String args[]){
        // calc3 obj =new  calc3();
        // AdvCalc3 obj =new  AdvCalc3();
        ScifiCal obj = new ScifiCal();
        int r1 =obj.add(2,3);
        int r2 =obj.sub(7,3);
        int r3=obj.multi(7,3);
        int r4 =obj.div(7,3);
        double r5 = obj.power(r3,r4);
        
        System.out.println(r1 + " " + r2 + " " + r3 +" " + r4 +" "+ r5);
    }
}

