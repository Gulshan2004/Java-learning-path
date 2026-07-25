import java.util.Arrays;
import java.util.List;

public class MethodRefrence {
    public static void main(String args[]){

        List<String> names = Arrays.asList("Gulshan","Navin","Harsh");
        
        List<String> uNames = names.stream()
                                    .map(String::toUpperCase) //this will convert the names into UPPER CASE
                                    .toList();
        System.out.println(uNames);

    }
}
/*Note:-
 toList() is a method which is used to return a stream into list format
 
 Method referencing :-
 String::toUpperCase is called method referencing where rather than passing the names.toUpperCase() we
 pass the method name and the class name 
 */