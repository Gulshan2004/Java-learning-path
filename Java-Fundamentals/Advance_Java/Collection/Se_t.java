package Collection;

// import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
// import java.util.Set;
import java.util.TreeSet;

public class Se_t {
    public static void main(String args[]) {
        Collection<Integer> nums = new TreeSet<Integer>(); // we can use collection instead of Set because Collection implements Set extends Collection
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);

       Iterator<Integer> values = nums.iterator(); //Iterator will give us all the values in the values 
       
       //We can use a while loop to iterate over the values and print them 
       while(values.hasNext()){ //hasNext() tells whether we have a nextg element or not 
       System.out.println(values.next()); //next() will give one element at a time 
    }
}
}
/*
NOTE:-

Set is a Collection of  Unique Value 
Set dont give us value in sorted order so to get the value in sorted order we use TreeSet instead of HashSet
Set Dont have index value*/