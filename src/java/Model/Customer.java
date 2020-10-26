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
public class Customer 
{
    Koneksi kon = new Koneksi();
    String Idcust,Nama,Alamat,Notlp,UserName,Password,Rekening;
    
    public String getIdcust() {return Idcust;}
    public String getNama() {return Nama;}
    public String getAlamat() {return Alamat;}
    public String getNotlp() {return Notlp;}
    public String getUserName() {return UserName;}
    public String getPassword() {return Password;}
    public String getRekening() {return Rekening;}
    
    public void setIdcust(String Idcust) {this.Idcust = Idcust;}
    public void setNama(String Nama) {this.Nama = Nama;}
    public void setAlamat(String Alamat) {this.Alamat = Alamat;}
    public void setNotlp(String Notlp) {this.Notlp = Notlp;}
    public void setUserName(String UserName) {this.UserName = UserName;}
    public void setPassword(String Password) {this.Password = Password;}
    public void setRekening(String Rekening) {this.Rekening = Rekening;}
    
    public int Insert(){
        try 
        {
            Connection con = kon.open();
            String sql = "insert Customer values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Idcust);
            ps.setString(2, this.Nama);
            ps.setString(3, this.Alamat);
            ps.setString(4, this.Notlp);
            ps.setString(5, this.UserName);
            ps.setString(6, this.Password);
            ps.setString(7, this.Rekening);
            int res = ps.executeUpdate();
            return res;
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public int Login()
    {
        try 
        {
            Connection con = kon.open();

            String sql = "select * from Customer where UserName=? and Password=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.UserName);
            ps.setString(2, this.Password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                this.setIdcust(rs.getString("Id_Customer"));
                this.setRekening(rs.getString("Rekening"));
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
    
    public ResultSet ReadByUname()
    {
        try
        {
            Connection con = kon.open();
            String sql = "select * from Customer where UserName=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.UserName);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public String AutoIDCustomers(){
        try
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select top 1 Id_Customer from Customer order by Id_Customer desc";
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            String IdCustomers = null;
            if(rs.next())
            {
                IdCustomers = rs.getString("Id_Customer");
                int nextnumber = Integer.parseInt(IdCustomers.substring(1)) + 1;
                if(nextnumber < 10)
                {
                    IdCustomers = "C000" + nextnumber;
                }
                else if(nextnumber < 100)
                {
                    IdCustomers = "C00" + nextnumber;
                }
                else if(nextnumber < 1000)
                {
                    IdCustomers = "C0" + nextnumber;
                }
                else if(nextnumber < 10000)
                {
                    IdCustomers = "C" + nextnumber;
                }
            }
            else
            {
                IdCustomers = "C0001";
            }
            return IdCustomers;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
    
    public int UpdateRekening()
    {
        try 
        {
            Connection con = kon.open();
            String sql = "update Customer set Rekening=? where Id_Customer=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Rekening);
            ps.setString(2, this.Idcust);
            int res = ps.executeUpdate();
            return res;
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
}
