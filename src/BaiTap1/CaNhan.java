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
public abstract class CaNhan 
{
    protected String hoTen;
    protected int tuoi;
    protected String diaChi;
    protected String sdt;

    
    public String getHoten() 
    {
        return hoTen;
    }
    public void setHoten(String hoten) 
    {
        this.hoTen = hoTen;
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
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    
    
    public abstract String hienThiTT();
}