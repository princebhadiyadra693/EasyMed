/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ab");  
            return con;
        }
        catch(Exception e){
            return null;   
        }
    }
}
