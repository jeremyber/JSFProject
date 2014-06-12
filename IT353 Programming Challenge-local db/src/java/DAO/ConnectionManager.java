package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Brandon Salm and Jeremy Ber
 * @author bmsalm
 */
public class ConnectionManager {
    
    public static Connection getNewConnection()
    {
        Connection newConnection;
        
        //set connection driver
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("/n"+e.getMessage());
            return null;
        }
     
        //set connection address
        try {
            String myDB = "jdbc:derby://localhost:1527/project353";
            newConnection = DriverManager.getConnection(myDB, "itkstu", "student");
        } catch (SQLException e) {
            System.err.println("/n"+e.getMessage());
            return null;
        }

        return newConnection;
    }
    
}
