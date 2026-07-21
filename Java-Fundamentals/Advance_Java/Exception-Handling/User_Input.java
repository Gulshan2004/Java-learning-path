//USER INOUT USING BUFFEREADER AND SCANNER

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class User_Input{
    public static void main(String args[]) throws IOException{ //throws is just used for understanidng the concept it is not suitable to use it with the main method
        System.out.println("Enter a Number");

    //    InputStreamReader in = new InputStreamReader(System.in);
    //    BufferedReader bf = new BufferedReader(in); // buffer reader can take input from anywhere whether it a file ,network etc. 
    //    int num = Integer.parseInt(bf.readLine()); // readline() method gives us a String so in order to get integer value use Integer.parseInt

    //Note: Buffer reader is a resource as it can read from a file , network , db so these resources must be freed after using so to free them we use 
    //bf.close()  // .close() method is used to free the resource 


    //Instead of Buffer reader we can use Scanner
       Scanner sc = new Scanner(System.in); //System .in is used for the source from whre the input is taken
       int num = sc.nextInt();
       System.out.println(num); 
    }
}
/*println is a method of PrintSream and out is a object of PrintStream
and this object is created as a static varibale inside the System class 

In our keyboard Every character has an ascii value 
0 = 48
A = 65
a = 97


System.in.read();
for getting a bigger no. the read method is not suitable so we use a specialized class 
so instead of System.out.read() we use the concept of BufferedReader  it is a class 
which works with IO and it belongs to the package java.io
*/