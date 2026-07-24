import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(4,5,6,7,3,2);

        //nums.forEach(n->System.out.println(n)); //Foreach is a part of List Interface and it gives us one value at a time 

        //consumerInterface is a functional interface so we can use lamda expression over here 
        Consumer<Integer> con =(n)->System.out.println(n); //Lamda Expression 
        
        nums.forEach(con);


        // int sum=0;
        // for(int n:nums){
        //     if(n%2==0){
        //         n=n*2;
        //         sum = sum + n;
        //     }
        // }

        // System.out.println(sum);
    }
}
