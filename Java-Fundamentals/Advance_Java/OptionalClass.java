import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Gulshan","Laksmi","John","Kishor");

        Optional<String> name = names.stream()
        .filter(str->str.contains("x"))
        .findFirst();

        System.out.println(name.orElse("Not Found")); //Definin or else separartely
        
        //BOTH ABOVE AND BELOW  WORKS THE SAME 

        //System.out.println(name.orElse("Not Found")); // this means if you have the name then print it or else print not Found we can use or else as well without performing it separately
        //Shown Below
        String name1 = names.stream()
        .filter(str->str.contains("x"))
        .findFirst()
        .orElse("Not Found");

        System.out.println(name1);

    }
}
/*
findFirst() return an optional class which was introduce in java 1.8 which can into existing to avoid 
the null pointer Exception

orElse() is  method from the optional class which is used to avoid the null pointer exception 
 */