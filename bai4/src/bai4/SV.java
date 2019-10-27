package bai4;
import java.util.*;
public class SV {
    private String hoTen;
    private Date ngaySinh;
    private double dtb;
    
    public SV(String hoTen, Date ngaySinh, double dtb){
        this.hoTen= hoTen;
        this.ngaySinh= ngaySinh;
        this.dtb= dtb;
    }
    
    public String layHoTen(){
        return hoTen;
    }
    
    public void ganHoTen(String ht) {
        this.hoTen= hoTen;
    }
    
    public Date layNgaySinh(){
        return ngaySinh;
    }
    
    public void ganNgaySinh(Date ns){
        this.ngaySinh= ngaySinh;
    }
    
    public double layDTB(){
        return dtb;
    }
    
    public void ganDTB(double dtb){
        this.dtb= dtb;
    }
    
    public void hienThi(){
        System.out.println("\nHo va ten: "+hoTen+"\nNgay Sinh: "+ngaySinh+"\nDTB: "+dtb);
    }
    
    public String layHo(){
        String a= this.layHoTen();
        return a.split(" ")[0];
    }
    
    public String layTen() {
        String b= this.layHoTen();
        return b.split(" ")[1];
    }
    
    public String layDem(){
        String c= this.layHoTen();
        return c.split(" ")[2];
    }
    
    public int layTuoi(){
        Date age= new Date();
        return (age.getYear()+1900)-this.ngaySinh.getYear();
    }
    
    public String layXepLoai(){
        if(dtb<5){
            return "Yếu";
        } else {
            if(dtb<7){
                return "Trung bình";
            } else {
                if(dtb<8) {
                    return "Khá";
            } else {
                    return "Giỏi";
                }
            }
        } 
    }
}
    

