/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.*;
/**
 *
 * @author ASJoker76
 */
public class Koneksi 
{
    public Connection open()
    {
        Connection con;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ASUS-EEPC\\SQL14;databaseName=IAQurban";
            con = DriverManager.getConnection(url, "sa", "chelsea@76");
            return con;
        }
        catch (Exception e)
        {
            System.err.println("Koneksi Tidak Tehubung "+e.getMessage());
            return null;
        }
    }
}
