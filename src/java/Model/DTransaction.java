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
public class DTransaction {
    Koneksi kon = new Koneksi();
    String Idtrans,Idhewan,Idcustbeli,Idcustjual,TanggalPemesanan,TanggalPembayaran,TanggalPengiriman,TanggalTerima,Status,foto ;
    int total;
    
    public String getIdtrans() {return Idtrans;}
    public String getIdhewan() {return Idhewan;}
    public String getIdcustbeli() {return Idcustbeli;}
    public String getIdcustjual() {return Idcustjual;}
    public String getTanggalPemesanan() {return TanggalPemesanan;}
    public String getTanggalPembayaran() {return TanggalPembayaran;}
    public String getTanggalPengiriman() {return TanggalPengiriman;}
    public String getTanggalTerima() {return TanggalTerima;}
    public int getTotal() {return total;}
    public String getStatus() {return Status;}
    public String getFoto() {return foto;}
    
    public void setIdtrans(String Idtrans) {this.Idtrans = Idtrans;}
    public void setIdhewan(String Idhewan) {this.Idhewan = Idhewan;}
    public void setIdcustbeli(String Idcustbeli) {this.Idcustbeli = Idcustbeli;}
    public void setIdcustjual(String Idcustjual) {this.Idcustjual = Idcustjual;}
    public void setTanggalPemesanan(String TanggalPemesanan) {this.TanggalPemesanan = TanggalPemesanan;}
    public void setTanggalPembayaran(String TanggalPembayaran) {this.TanggalPembayaran = TanggalPembayaran;}
    public void setTanggalPengiriman(String TanggalPengiriman) {this.TanggalPengiriman = TanggalPengiriman;}
    public void setTanggalTerima(String TanggalTerima) {this.TanggalTerima = TanggalTerima;}
    public void setTotal(int total) {this.total = total;}
    public void setStatus(String Status) {this.Status = Status;}
    public void setFoto(String foto) {this.foto = foto;} 
    
    public int Insert(){
        try 
        {
            Connection con = kon.open();
            String sql = "insert DTrans values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Idtrans);
            ps.setString(2, this.Idhewan);
            ps.setString(3, this.Idcustbeli);
            ps.setString(4, this.Idcustjual);
            ps.setString(5, this.TanggalPemesanan);
            ps.setString(6, this.TanggalPembayaran);
            ps.setString(7, this.TanggalPengiriman);
            ps.setString(8, this.TanggalTerima);
            ps.setInt(9,this.total);
            ps.setString(10, this.Status);
            ps.setString(11, this.foto);
            int res = ps.executeUpdate();
            return res;
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public String AutoIDTrans(){
        try
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select top 1 Id_Trans from DTrans order by Id_Trans desc";
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            String IdTrans = null;
            if(rs.next())
            {
                IdTrans = rs.getString("Id_Trans");
                int nextnumber = Integer.parseInt(IdTrans.substring(1)) + 1;
                if(nextnumber < 10)
                {
                    IdTrans = "T000" + nextnumber;
                }
                else if(nextnumber < 100)
                {
                    IdTrans = "T00" + nextnumber;
                }
                else if(nextnumber < 1000)
                {
                    IdTrans = "T0" + nextnumber;
                }
                else if(nextnumber < 10000)
                {
                    IdTrans = "T" + nextnumber;
                }
            }
            else
            {
                IdTrans = "T0001";
            }
            return IdTrans;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet readByIdCustBeli(){
        try
        {
            Connection con = kon.open();
            String sql = "select * from DTrans where Id_Customer_Beli=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Idcustbeli);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet readByIdCustJual(){
        try
        {
            Connection con = kon.open();
            String sql = "select * from DTrans where Id_Customer_Jual=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Idcustjual);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet readByIdTrans(){
        try
        {
            Connection con = kon.open();
            String sql = "select * from DTrans where Id_Trans=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.Idtrans);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet readAll(){
        try 
        {
            Connection con = kon.open();
            String sql = "select * from DTrans";
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
    
    public int UpdatePembayaran()
    {
        try 
        {
            Connection con = kon.open();
            String sql = "update DTrans set Tanggal_Pembayaran=?,Status=? where Id_Trans=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.TanggalPembayaran);
            ps.setString(2, this.Status);
            ps.setString(3, this.Idtrans);
            int res = ps.executeUpdate();
            return res;
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public int UpdatePengiriman()
    {
        try 
        {
            Connection con = kon.open();
            String sql = "update DTrans set Tanggal_Pengiriman=?,Status=? where Id_Trans=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.TanggalPengiriman);
            ps.setString(2, this.Status);
            ps.setString(3, this.Idtrans);
            int res = ps.executeUpdate();
            return res;
        }
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public int UpdateTerima()
    {
        try 
        {
            Connection con = kon.open();
            String sql = "update DTrans set Tanggal_Terima=?,Status=? where Id_Trans=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.TanggalTerima);
            ps.setString(2, this.Status);
            ps.setString(3, this.Idtrans);
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
