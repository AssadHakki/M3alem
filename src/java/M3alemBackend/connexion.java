package M3alemBackend;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connexion {
    
    /*
    Best way to avoid error: 
        java.sql.SQLException: Listener refused the connection with the following error: ORA-12519,
        TNS:no appropriate service handler found The Connection descriptor used by the client was: localhost:1521:xe
    is not to connect all the time to database, just once will do.
     */
    private static Connection conn;

    public static Connection Seconnecter() {
        try {
            if (conn == null) {
                Class.forName("oracle.jdbc.driver.OracleDriver");

                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",  "m3alem", "123");

                System.out.println("Successfully connected to oracle database.");
            }
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(connexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /*
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
     */
}
