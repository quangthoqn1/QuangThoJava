/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.số.pkg5;


public class SinhVien {
    private String hoTen;
    private DiemHP hp1, hp2;

    public SinhVien() {
    }

    public SinhVien(String ten, DiemHP hp1, DiemHP hp2) {
        hoTen = ten;
        this.hp1 = hp1;
        this.hp2 = hp2;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public DiemHP getHp1() {
        return hp1;
    }

    public void setHp1(DiemHP hp1) {
        this.hp1 = hp1;
    }

    public DiemHP getHp2() {
        return hp2;
    }

    public void setHp2(DiemHP hp2) {
        this.hp2 = hp2;
    }

    public double tinhDtb() {
        return (double) (hp1.laySoTinChi() * hp1.tinhDiem() + hp2.laySoTinChi() * hp2.tinhDiem())
                / (hp1.laySoTinChi() + hp2.laySoTinChi());
  
        
    }

    public void getInfo() {
        System.out.println ("ho vs ten: " + hoTen + "\n"+ "hoc phan 1: "
                + hp1 + "\n" + "hoc phan 2: " + hp2 +
                "\n" + "diem tb: " + tinhDtb());      
    }
    
    public String ToString(){
        return ("ho vs ten: " + hoTen + "\n"+ "hoc phan 1: "
                + hp1 + "\n" + "hoc phan 2: " + hp2 + "\n" + "diem tb: " + tinhDtb());      
        
    }
}
            
  
    

