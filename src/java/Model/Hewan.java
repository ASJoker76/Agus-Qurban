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
public class Hewan 
{
    Koneksi kon = new Koneksi();
    String Idhewan,Idcust,Namahewan,Type,Status,Foto ;
    int Berat,Umur,Harga;
    
    public String getIdhewan() {return Idhewan;}
    public String getIdcust() {return Idcust;}
    public String getNamahewan() {return Namahewan;}
    public int getBerat() {return Berat;}
    public int getUmur() {return Umur;}
    public int getHarga() {return Harga;}
    public String getType() {return Type;}
    public String getStatus() {return Status;}
    public String getFoto() {return Foto;}
    
    public void setIdhewan(String Idhewan) {this.Idhewan = Idhewan;}
    public void setIdcust(String Idcust) {this.Idcust = Idcust;}
    public void setNamahewan(String Namahewan) {this.Namahewan = Namahewan;}
    public void setBerat(int Berat) {this.Berat = Berat;}
    public void setUmur(int Umur) {this.Umur = Umur;}
    public void setHarga(int Harga) {this.Harga = Harga;}
    public void setType(String Type) {this.Type = Type;}
    public void setStatus(String Status) {this.Status = Status;}
    public void setFoto(String Foto) {this.Foto = Foto;}
    
    public String AutoIDHewan(){
        try
        {
            Connection con = kon.open();
            
            String sql = "select top 1 Id_Hewan from Hewan order by Id_Hewan desc";
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            String IdHewan = null;
            if(rs.next())
            {
                IdHewan = rs.getString("Id_Hewan");
                int nextnumber = Integer.parseInt(IdHewan.substring(1)) + 1;
                if(nextnumber < 10)
                {
                    IdHewan = "H000" + nextnumber;
                }
                else if(nextnumber < 100)
                {
                    IdHewan = "H00" + nextnumber;
                }
                else if(nextnumber < 1000)
                {
                    IdHewan = "H0" + nextnumber;
                }
                else if(nextnumber < 10000)
                {
                    IdHewan = "H" + nextnumber;
                }
            }
            else
            {
                IdHewan = "H0001";
            }
            return IdHewan;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet readAll(){
        try 
        {
            Connection con = kon.open();
            String sql = "select * from Hewan where Status_Hewan=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Status);
            ResultSet rs = ps.executeQuery();
            return rs;
            
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
        
    }
    
    public int Insert(){
        try 
        {
            Connection con = kon.open();
            String sql = "insert Hewan values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Idhewan);
            ps.setString(2, this.Idcust);
            ps.setString(3, this.Namahewan);
            ps.setInt(4, this.Berat);
            ps.setInt(5, this.Umur);
            ps.setInt(6, this.Harga);
            ps.setString(7, this.Type);
            ps.setString(8, this.Status);
            ps.setString(9, this.Foto);
            int res = ps.executeUpdate();
            return res;
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public ResultSet readByIdCustomer(){
        try
        {
            Connection con = kon.open();
            String sql = "select * from Hewan where Id_Customer=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Idcust);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet readAllhewan(){
        try 
        {
            Connection con = kon.open();
            String sql = "select * from Hewan ";
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            return rs;
            
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
        
    }
    
    public ResultSet readByNameHewan(){
        try
        {
            Connection con = kon.open();
            String sql = "select * from Hewan where Nama_Hewan like ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%"+this.Namahewan+"%");
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet readByIdHewan(){
        try
        {
            Connection con = kon.open();
            String sql = "select * from Hewan where Id_Hewan=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Idhewan);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public int Update()
    {
        try 
        {
            Connection con = kon.open();
            String sql = "update Hewan set Nama_Hewan=?,Berat_Hewan=?,Umur_Hewan=?,Harga_Hewan=?,Type_Hewan=?,Status_Hewan=? where Id_Hewan=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Namahewan);
            ps.setInt(2, this.Berat);
            ps.setInt(3, this.Umur);
            ps.setInt(4, this.Harga);
            ps.setString(5, this.Type);
            ps.setString(6, this.Status);
            ps.setString(7, this.Idhewan);
            int res = ps.executeUpdate();
            return res;
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public int UpdateImage()
    {
        try 
        {
            Connection con = kon.open();
            String sql = "update Hewan set foto=? where Id_Hewan=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Foto);
            ps.setString(2, this.Idhewan);
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
