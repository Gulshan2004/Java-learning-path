package Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{ //instead of comparing in the mains method we can use comparable interface this implements a method called compareTo()
    //using Comparable we are giving the ability to students to compare themselves  this avoid the usage of Comparator 
    //so comparable give the power to class itself 
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) { 
        if(this.age>that.age) //compares current student using this with the other student 
                    return 1;
                else
                    return -1;
    }
}

public class ComparatorVsComparable {
    public static void main(String args[]) {

        //Comparator is a functional interface so we can use lamda expression here as well
        Comparator<Student> com = ( s1,  s2)-> { //compare() method is used for swapping  also in lamda expression we dont even have to specify the type for s1 and s2 i.e Student
                // if(s1.age>s2.age)
                //     return 1;
                // else
                //     return -1;

                return s1.age>s2.age?1:-1;
            };
        
        List<Student> s = new ArrayList<>();
        s.add(new Student(21, "Gulshan"));
        s.add(new Student(27, "shan"));
        s.add(new Student(25, "Harsh"));
        s.add(new Student(23, "David"));
        s.add(new Student(20, "Paul"));

        Collections.sort(s,com);
        for (Student x : s) {
            System.out.println(x);
        }
        // To Sort these students on the basis of age :-

        // Comparator<Integer> com = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j) {
        // if (i % 10 > j % 10) {
        // return 1; // if we retun 1 it will swap and if we retun -1 it will not swap
        // } else
        // return -1;
        // }
        // };
        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);

        // Collections.sort(nums, com);// if we want to specify our own logic we have to
        // pass an objcet of a comparator
        // System.out.println(nums);



        // Sorting based on Length of string
        // Comparator<String> name = new Comparator<String>() {
        // public int compare(String a, String b) {
        // if (a.length() > b.length())
        // return 1;
        // else {
        // return -1;
        // }
        // }
        // };
        // List<String> s = new ArrayList<>();
        // s.add("Gulshan");
        // s.add("shan");
        // s.add("Harsh");
        // s.add("Ayush");

        // Collections.sort(s, name);
        // System.out.println(s);

    }
}

/*
 * Note:-
  Comparotor is an Interface
  
  We have choice between comparable and comperator
  even if we mention comparable we can still override the logic using comparator
 */