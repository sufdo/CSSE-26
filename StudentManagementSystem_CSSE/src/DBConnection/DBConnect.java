/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rishni
 */
public class DBConnect {
    public static Connection connect()
    {
        Connection conn=null;
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");//driver
            
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12195356?","sql12195356","Ljn1tyi73K"); //getconnection to db (url,username,pwd)
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return conn;
    }
}
