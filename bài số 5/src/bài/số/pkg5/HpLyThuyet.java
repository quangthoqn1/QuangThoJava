/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.số.pkg5;

/**
 *
 * @author SV
 */
public class HpLyThuyet extends DiemHP {
    

    private int cc;
    private int gk;
    private int ck;

    public HpLyThuyet(int cc, int gk, int ck, String tenHp, int soTc) {
        super(tenHp, soTc);
        this.cc = cc;
        this.gk = gk;
        this.ck = ck;
    }

    //diem dau vao la cac so nguyen tu 0 den 10.
    @Override
    public double tinhDiem() {
        if ((cc >= 0 && cc <= 10) && (gk >= 0 && gk <= 10) && (ck >= 0 && ck <= 10)) {
            return (cc * 0.1 + gk * 0.2 + ck * 0.7);
        }
        return 0;
    }
    
    public void getInfo(){
       
        System.out.println("chuyen can: " + cc + "," + "giua ki: " + gk + "," + "cuoi ki" + ck);
    }
    
    public String ToString(){
        String tenHp = null;
        return ("cc: " + ck + "\n"+ "gk "
                + gk + "\n" + "ck " + ck + "\n" + "ten hp: " + tenHp + "soT");      
        
    }

}
