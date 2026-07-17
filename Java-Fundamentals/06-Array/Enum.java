enum Status{ //Status is a Class here 
     Running , Failed , Pending , Success; // these are the objects of Status also refereef as Named Constants
     //Each of these have indexes with them  0,1,2,3 and these can be accessed using the ordinal() method .
}
public class Enum {
    public static void main(String args[]){
    
        Status[] v = Status.values();
        for(Status s:v){
            System.out.println(s+":"+ s.ordinal());
        }

        
        Status s = Status.Running; // assigning variable to each object 
        Status f = Status.Failed;
        Status P = Status.Pending;
        System.out.println(s);
        System.out.println(f);
        System.out.println(P);

        System.out.println(s.ordinal());

    }
}
