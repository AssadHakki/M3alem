
package M3alemBackend;

import java.sql.*;
public class connexion
{
    

   // Connect to Oracle Database
    public static Connection Seconnecter()
    {
        try
        {
           // Register driver class
           Class.forName("oracle.jdbc.driver.OracleDriver");

           // Create connection
           Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "m3alem", "123");

           System.out.println("Successfully connected to oracle database ");

           return conn;
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        } 
        catch (SQLException e) 
        {
            System.err.println("SQLException: " + e.getMessage());
        }

        // Failed to connect
        return null;
    }


}
