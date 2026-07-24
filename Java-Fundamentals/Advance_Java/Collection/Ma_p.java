// import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ma_p {
    public static void main(String args[]){
       Map<String,Integer> students =new HashMap<>();
       
       students.put("Gulshan",56);
       students.put("shan",23);
       students.put("Harsh",67);
       students.put("Kiran",92);

       students.put("Harsh",45); //this will ovverride the previous value of harsh which was 67
       //System.out.println(students);// This will give the marks of all the students in a key value pair.
       System.out.println(students.get("Harsh")); //can access the value using the key of that element

       for(String key: students.keySet()){ // enhanced for loop to print all the key value pairs from students
        System.out.println(key+" : " + students.get(key));
       }
    }
}
/*NOTE:-
Map itsef is an interfce.
A Map is a Data Structure which is a collection of a key value pair 
we cannot have duplicate keys in a map

to add keys to a map we use the put() method
keySet() gives all the value of keys
values() gives all the values of the map
remove() is used to remove the particular entry from the map

HashTable and HashMap work similarly but the Hashtable is synchronized and hashMap is not
so if want to use HashMap with threads we need to explicitky mention synchronized keyword 
wheras HashTable() dont require it.
*/
