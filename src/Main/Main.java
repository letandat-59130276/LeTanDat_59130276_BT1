/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import BaiTap1.GiaoVien;
import BaiTap1.HocSinh;
import BaiTap1.LopHoc;
/**
 *
 * @author Con Meo Cutee
 */
public class Main {
    public static void main(String[] args) 
    {
        //Hoc sinh
        HocSinh hs1 = new HocSinh("Le Tan Dat", 20, "Dien Khanh - Khanh Hoa", "0395845874", "59.CNTT-2", "Ca hat");
        HocSinh hs2 = new HocSinh("Dinh Thi My", 20, "Thai Ninh - Bac Giang", "0354845795", "59.CNTT-2", "The thao");
        HocSinh hs3 = new HocSinh("Tran Nhan Tam", 22, "Hoang Liem - Ha Noi", "0654856952", "59.CNTT-2", "Boi loi");
        //Giao vien    
        GiaoVien gv1 = new GiaoVien("Huynh Tuan Anh", 40, "Nha Trang - Khanh Hoa", "0999123456", "Design Pattern", "IT");
        GiaoVien gv2 = new GiaoVien("Mai Cuong Tho",35, "Nha Trang - Khanh Hoa", "0985465851", "Computer Networks", "IT");
        GiaoVien gv3 = new GiaoVien("Le Thi Bich Hang", 39, "Nha Trang - Khanh Hoa", "0958654123", "Software Engineering", "IT");

        //Tao lop voi giao vien chu nhiem
        LopHoc lopHoc = new LopHoc();
        //Tao them hoc sinh
        lopHoc.themHS(hs1);
        lopHoc.themHS(hs2);
        lopHoc.themHS(hs3);
        lopHoc.themHS(hs1);
        //Tao them giao vien
        lopHoc.themGV(gv1);
        lopHoc.themGV(gv2);
        lopHoc.themGV(gv3);
        lopHoc.themGV(gv1);
        
        //In danh sach hoc sinh
        System.out.println("\nDanh sach hoc sinh:");
        lopHoc.inDSHS();
        //In danh sach giao vien
        System.out.println("\nDanh sach giao vien:");
        lopHoc.inDSGV();
    }
}
