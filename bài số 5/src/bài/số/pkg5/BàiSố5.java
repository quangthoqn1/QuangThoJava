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
public class BàiSố5 {

    public static void main(String[] args) {
            SinhVien ds[] = new SinhVien[5];
        ds[0] = new SinhVien("Nguyen Thi Mo",
                new HpThucHanh(1, 2, 3, "LTHDT", 2),
                new HpLyThuyet(3, 2, 1, "CTDL", 2));
        ds[1] = new SinhVien("Nguyen Van T",
                new HpThucHanh(1, 2, 3, "sql", 3),
                new HpLyThuyet(3, 2, 1, "ltcb", 3));
        ds[2] = new SinhVien("Nguyen Van T",
                new HpThucHanh(1, 2, 3, "LTHDT", 3),
                new HpLyThuyet(3, 2, 1, "CTDL", 3));
        ds[3] = new SinhVien("Nguyen Van Te",
                new HpThucHanh(1, 2, 3, "LTHDT", 3),
                new HpLyThuyet(3, 2, 1, "CTDL", 3));
        ds[4] = new SinhVien("Nguyen Van To",
                new HpThucHanh(1, 2, 3, "LTHDT", 3),
                new HpLyThuyet(3, 2, 1, "CTDL", 3));
        System.out.println(ds[0].ToString());
        int i  = 0;
        for (i=0;i<5;i++){
            ds[i].getInfo();
}
    }
    
}
