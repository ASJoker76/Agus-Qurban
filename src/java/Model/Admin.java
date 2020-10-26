/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ASJoker76
 */
public class Admin {
    
    Koneksi kon = new Koneksi();
    String Idadmin,UserName,Password,Status;
     
    
    public String getIdadmin() {return Idadmin;}
    public String getUserName() {return UserName;}
    public String getPassword() {return Password;}
    public String getStatus() {return Status;}
    
    public void setIdadmin(String Idadmin) {this.Idadmin = Idadmin;}
    public void setUserName(String UserName) {this.UserName = UserName;}
    public void setPassword(String Password) {this.Password = Password;}
    public void setStatus(String Status) {this.Status = Status;}
    
    public int Login()
    {
        String idadmin;
        try 
        {
            Connection con = kon.open();

            String sql = "select * from Admin where UserName=? and Password=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.UserName);
            ps.setString(2, this.Password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                this.setIdadmin(rs.getString("Id_Admin"));
                return 1;
            }
            else
            {
                return 0;
            }
        } 
        catch (Exception e) 
        {
            System.err.println("Login Server: " + e);
            return 0;
        }
    }
    
    
}
