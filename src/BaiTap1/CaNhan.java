/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Con Meo Cutee
 */
abstract public class CaNhan 
{
    private String hoten;
    private int tuoi;
    private String diaChi;
    private String sdt;
    private String hoTen;

    
    public String getHoten() 
    {
        return hoten;
    }
    public void setHoten(String hoten) 
    {
        this.hoten = hoten;
    }

    
    public int getTuoi() 
    {
        return tuoi;
    }
    public void setTuoi(int tuoi) 
    {
        this.tuoi = tuoi;
    }
    

    public String getDiaChi() 
    {
        return diaChi;
    }
    public void setDiaChi(String diaChi) 
    {
        this.diaChi = diaChi;
    }

    
    public String getSdt() 
    {
        return sdt;
    }
    public void setSdt(String sdt) 
    {
        this.sdt = sdt;
    }

    
    public CaNhan(String hoten, int tuoi, String diaChi, String sdt) 
    {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    // getter, setter
    public void sethoTen(String hoTen) { this.hoTen = hoTen; }
    public void settuoi(int tuoi) { this.tuoi = tuoi; }
    public void setdiaChi(String diaChi) { this.diaChi = diaChi; }
    public void setsdt(String sdt) { this.sdt = sdt; }
    public String gethoTen() { return this.hoTen; }
    public int gettuoi() { return this.tuoi; }
    public String getdiaChi() { return this.diaChi; }
    public String getsdt() { return this.sdt; }
    
    abstract String hienThiTT();
}