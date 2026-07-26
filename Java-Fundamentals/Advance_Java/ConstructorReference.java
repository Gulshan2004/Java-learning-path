import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;
    public Student(){ // Default constructor
         
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
    
}
public class ConstructorReference {

    public static void main(String args[]) {

        List<String> names = Arrays.asList("Gulshan", "Navin", "Harsh");

        //Now I want to create one student object for each name
        List<Student> students =new ArrayList<>(); // this is a list of students which is empty at the moment

        //Every time the loop runs we create a new student object 
        // for(String name:names){
        //     students.add(new Student(name));
        // }

        //NOW DOING THE SAME THING USING Stream Api
        students = names.stream() // so the stream will have three names
                        .map(Student::new) //the map will take one name and create a new student object
                        .toList(); //converting stream to list

        System.out.println(students);
    }
}
/*
Constructor Refrence:-
instead of doing  map(name->new  Student(name))  we can do Student::new this will create a new student object 
*/