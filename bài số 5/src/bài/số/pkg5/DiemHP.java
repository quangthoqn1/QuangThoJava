/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.số.pkg5;


    abstract class DiemHP {

    protected String tenHP;
    protected int soTinChi;

    public DiemHP(String tHP, int sTC) {
        tenHP = tHP;
        soTinChi = sTC;
    }

    public String layTenHP() {
        return tenHP;
    }

    public int laySoTinChi() {
        return soTinChi;
    }

    abstract double tinhDiem();

   
   
    
}

