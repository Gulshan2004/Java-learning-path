import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class Array_List {
    public static void main(String args[]) {
        List<Integer> nums = new ArrayList<Integer>();//Array LIst is a class which implements list which supports indexing so we can use it when we are working with index values
        nums.add(6);//These are not Integers these are objects therefor to work with integers DataType We use 
                      // <> brackets inside which we define the class of Data type we want to work with and it is useful in removing bugs as well       
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.get(2)); // OUTPUT:-8

        // for (int n : nums) {   //The Collection Interface dont have indexing so we used loop here
        //     System.out.println(n);
        // }
    }
}
/*
NOTE:-
ByDefault the Collection  works with objects

The collection interface belong to a java.util interface so we need to import
it

Collection<Integer> nums = new ArrayList<Integer>(); we can access the index from the collection but he list inteface have the method for getting 
the index so we used List Instead


 */