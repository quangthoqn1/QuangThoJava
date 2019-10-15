/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.số.pkg4;
import java.util.*;
import java.util.Date;
import java.util.StringTokenizer;

public class SV {

    private String hoTen;
    private Date ngaySinh;
    private final double dtb;

    public SV(String ht, Date ns, double dtb) {
        this.hoTen = ht;
        this.ngaySinh = ns;
        this.dtb = dtb;
    }

    SV(String lê_Thị_Hương) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String layHoTen() {
        return hoTen;
    }

    public void ganHocTen(String t) {
        hoTen = t;
    }

    public Date ngaySinh() {
        return ngaySinh;
    }

    public void ganNgaySinh(Date ns) {
        ngaySinh = ns;
    }

    public double layDTB() {
        return dtb;
    }

    public void ganDTB(double dtb) {
        dtb = dtb;
    }

    public void hienthi() {
        System.out.println("hoTen: " + hoTen + "\nngaySinh: " + ngaySinh
                + "\ndiem tb la: " + dtb
                + "\nHo tui la: " + this.layHo()
                + "\nten tui la: " + this.layTen(hoTen)
                + "\nten dem cua tui la: " + this.layDem(hoTen) + "\n tuoi tui la: " + this.layTuoi());
    }

    public String layHo() {
        return hoTen.split(" ")[0];
    }

    public String layDem(String dem) {
        this.hoTen = dem;
        dem = dem.substring(dem.indexOf(" "), dem.lastIndexOf(" "));
        return dem;
    }

    public String layTen(String ten) {
        this.hoTen = ten;
        ten = ten.substring(ten.lastIndexOf(" "));
        return ten;
    }

    public int layTuoi() {
        Date ngayht = new Date();
        return (ngayht.getYear()) - this.ngaySinh.getYear();
    }

    public String layXepLoai() {
        if (dtb < 5) {
            return "Yếu";
        } else {
            if (dtb < 7) {
                return "Trung bình";
            } else {
                if (dtb < 8) {
                    return "Khá";
                } else {
                    return "Giỏi";
                }

            }
        }

    }

    void hienThi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String layTen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String layDem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object layNgaySinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
