import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class CollectionInterface {
    public static void main(String args[]) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);//These are not Integers these are objectsthere for to work with integers DataType We use 
                      // <> brackets inside which we define the class of Data type we want to work with 
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.get(2));

        // for (int n : nums) {
        //     System.out.println(n);
        // }
    }
}
/*
NOTE:-
The collection interface belong to a java.util interface so we need to import
it
  
ByDefault the Collection  works with objects

Collection<Integer> nums = new ArrayList<Integer>(); we can access the index from the collection but he list inteface have the method for getting 
the index so we used List Instead


 */