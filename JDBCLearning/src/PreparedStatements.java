import java.sql.*;

public class PreparedStatements {
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

        int sid =102;
        String sname = "Jasmine";
        int marks =58;

        String url = "jdbc:postgresql://localhost:5432/user";
        String uname = "postgres";
        String pass = "1923070";
        //String sql = "insert into student values (" + sid + ", '" + sname + "', "+ marks + ")"; // this is  a complex process cuz it requires concatenations and may lead to sql injectionas also we need to improve performance by caching the queries  as well  so wee need use Prepared Statements
        String sql = "insert into student values(?,?,?)";

        Connection con = DriverManager.getConnection(url, uname, pass); //STEP 3
        System.out.println("Connection Established");

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid); //this will replace the ?
        st.setString(2,sname); //this will replace the ?
        st.setInt(3,marks); //this will replace the ?

        st.execute(); //execute returns a boolean value here we didn't pass the sql statemet as paramerter cuz we already passed it in the prepared statement

        con.close();
        System.out.println("Connection Closed");
    }
}
