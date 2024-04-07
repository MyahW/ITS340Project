package its340_finalproject;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author myahw
 */
class MyConnection {
    Connection conn;

    public MyConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientdata?autoReconnection=true&useSSL=false", "root", "");
            System.out.println("Connection found");
        }
        catch(Exception e)
        {
            System.out.println("Database error!" + e);
        }
    }

    public Connection getConnection()
    {
        return conn;
    }
}
