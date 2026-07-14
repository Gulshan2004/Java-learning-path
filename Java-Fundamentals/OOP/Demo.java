public class Demo{
    public static void main(String args[]){
        //In Java The String is a Class itself so we need to  create an object to define it but 
        // We can make it directly as well like String name =" Gulshan" this will also be creating am object behind the seen too  its just simplifies the code .
        String name =new  String("Gulshan"); 
        System.out.println(name);
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1)); // This will return the character at the particular index in the String
        System.out.println(name.concat(" Kumar"));
    }
}