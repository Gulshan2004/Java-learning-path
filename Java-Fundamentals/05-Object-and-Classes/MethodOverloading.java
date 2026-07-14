class Calculator0{
    public int add(int n1, int n2,int n3){
        return n1+ n2+ n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String args[]){
        Calculator0 obj = new Calculator0();
        int r1= obj.add(2,4,9);
        System.out.println(r1);
    }
}
