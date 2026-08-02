import java.sql.*; //STEP 1;

public class CRUDoprtion {
    public static void main(String[] args) throws Exception {
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
//      String sql = "insert into student values (6, 'Rohan', 40)";  //Create
//      String sql = "update student set sname='Max where sid = 5";  //update
        String sql = "delete from student where sid =5"; //delete

        // Class.forName("org.postgresql.Driver"); this is optional  STEP 2
        Connection con = DriverManager.getConnection(url, uname, pass); //STEP 3
        System.out.println("Connection Established");
        Statement st = con.createStatement(); //STEP 4 Creates a Statement object for sending SQL statements to the database.
        st.execute(sql); //execute returns a boolean value

        con.close();
        System.out.println("Connection Closed");
    }
}
/*NOTE:-
* Here we will be performing CRUD operations
* C - Create
* R - Read
* U - Update
* D - Delete

also we have done the Read(R)  in the Demojdbc.java file where we focused on fetching data from the database itself
* execute() returns false when we are inserting a Create , update , delete query
*/
