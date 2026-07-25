import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parallel_stream {
    public static void main(String args[]){
    
        int size=10_000;
        List<Integer> nums = new ArrayList<>(size);
        

        Random ran = new Random();
        
        for (int i =1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }

        // int sum1 = nums.stream()
        //                 .map(i->i*2)
        //                 .reduce(0,(c,e)->c+e);
        

        long startSeq = System.currentTimeMillis();

        int sum2 = nums.stream()
        .map(i->{ // Adding Delay of 1 milli second
            try{
                Thread.sleep(1);
            }
            catch(Exception e){
            }
           return  i*2;
        })
        .mapToInt(i->i) //i->i means get a value and convert that to int 
        .sum();

        long endSeq =System.currentTimeMillis();

        long startpara = System.currentTimeMillis();

        int sum3 = nums.parallelStream()
        .map(i->{ // adding a delay of 1 milli second in parallel stream
            try{
                Thread.sleep(1);
            }
            catch(Exception e){
            }
           return  i*2;
        })
        .mapToInt(i->i)
        .sum();

        long endpara =System.currentTimeMillis();

        System.out.println( sum2 + " " + sum3); //  the result will be samme fot  both
        System.out.println("Seq: " + (endSeq - startSeq));
        System.out.println("Seq: " + (endpara - startpara));
    }
}
/* NOTE:-
mapToint() and reduce() works the same way but the difference is mapToint reduce the code complexity and simpler than reduce() in using

adding delay in the normal stream and Parallel Stream created a huge computation difference cuz the normal
stream was printing one value at a time but parallel stream can print  multiple stream values by working 
in parallel. 
but note we can use parallel stream when the operation are independent on the  values but incase we have dependent value like if we want to sort the array then 
parallel stream may not work.
*/