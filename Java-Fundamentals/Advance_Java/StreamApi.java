import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 3, 2);

        // Stream<Integer> s1 = nums.stream(); //Whatever values we have in list is in
        // s1 and this will not affect the original values of nums

        // Stream<Integer>s2= s1.filter(n->n%2==0); //filter() method in stream is used
        // to filter based on a condition OUTPUT:- 4 6 2

        // Stream<Integer>s3= s2.map(n->n*2);//Returns a stream consisting of the
        // results of applying the given function to the elements of this stream.
        // OUTPUT:-8 12 4

        // int result = s3.reduce(0,(c,e) -> c+e); //Performs a reduction on the
        // elements of this stream, using the provided identity value and an associative
        // accumulation function, and returns the reduced value.
        // System.out.println(result); //OUTPUT:- 24

        // working with predicate [filter]
        Predicate<Integer> p = (n) -> { // predicate is a functional interface so lamda expression can be used here
            return n % 2 == 0;
        };

        // working with Function [map]
        Function<Integer, Integer> fun = n -> n * 2;

        int result = nums.stream()
                .filter(p)
                .map(fun)
                .reduce(0, (c, e) -> c + e); //OUTPUT:-24
        System.out.println(result);


        //printing the evens in the sorted format using the Stream API
        Stream<Integer> sortedValues =nums.stream()
        .filter(n->n%2==0)
        .sorted(); //Returns a stream consisting of the elements of this stream, sorted according to natural order
    
        sortedValues.forEach(n->System.out.println(n)); // 2 4 6

    }
}
/*
  NOTE:-
  Stream is an Interface
  Once we use the stream we cannot reuse it
 
    .reduce(0, (c, e) -> c + e);  here 0 is the intial value of the , c is the carry and e is the element , c+e is the operation
 
 */