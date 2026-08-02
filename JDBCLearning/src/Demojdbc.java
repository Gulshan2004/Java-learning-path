import java.sql.*; //STEP 1

public class Demojdbc {
    public static void main(String[] args) throws Exception{
        /*
        * STEP 1:-import package
        * STEP 2: load and register
        * STEP 3: create connection
        * STEP 4: create statement
        * STEP 5: execute statement
        * STEP 6: process the results
        * STEP 7: close
        */

        String url = "jdbc:postgresql://localhost:5432/user";
        String uname = "postgres";
        String pass = "1923070";
        String sql = "select * from student";

       // Class.forName("org.postgresql.Driver"); this is optional  STEP 2
        Connection con = DriverManager.getConnection(url,uname,pass); //STEP 3
        System.out.println("Connection Established");
        Statement st = con.createStatement(); //STEP 4 Creates a Statement object for sending SQL statements to the database.
        ResultSet rs =st.executeQuery(sql); //STEP 5 Executes the given SQL statement, which returns a single ResultSet object.
        //System.out.println(rs.next()); //gives a boolean value behind the scene if we have next row it will return true else it will return false

//        rs.next();//if we are before the next line then it will jump to the first record
//        String name=rs.getString("sname");// in getString method we pass the column name
//        System.out.println("Name of the Student is " + name);

        while(rs.next()){
            System.out.print(rs.getInt(1)+ "-");
            System.out.print(rs.getString(2)+ "-");
            System.out.println(rs.getInt(3));
        }

        con.close();
        System.out.println("Connection Closed");
    }
}

/*
NOTE:-
 Class.forName("org.postgresql.Driver");  throws a class not found exception so to avoid it we use the throws keyword

getConnetion() return an object of connection
getString() is used to fetch a particular column with dataType as string
getInt() is used to fetch a particular column with dataType as Int
.next() checks do we have the next row if we have it then it will put a pointer to the next row
"jdbc:postgresql://localhost:5432/user" here the syntax is  jdbc:sql_name://localhost:portnumber/Databasename
 */