/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.số.pkg4;
import java.util.*;
public class BàiSố4 {

    public static void main(String[] args) {
        DSSV danhsach = new DSSV(5);
        SV sv[] = new SV[5];
        sv[0] = new SV("Lê Cẩm Ly", new Date(1999, 6, 15), 7);
        sv[1] = new SV("Trần Bá Tài", new Date(2003, 7, 25), 8);
        sv[2] = new SV("Lê Thị Hương", new Date(2002, 01, 12), 9);
        sv[3] = new SV("Lê Hồng Phong", new Date(1999, 9, 7), 5.5);
        sv[4] = new SV("Phan Thị Tuyết Nga", new Date(2000, 27, 12), 8.5);
        System.out.println(sv[4].layDem());
        for (int i = 0; i < 5; i++) {
            danhsach.them(sv[i]);
        }
        danhsach.sapHoTen();
        danhsach.lietKeXepLoai("Giỏi");
        if (danhsach.timTen("Nam") > 0) {
            System.out.println("Tìm thấy SV tên Nam ở vị trí " + danhsach.timTen("Nam"));
        } else {
            System.out.println("Không tìm thấy");
        }
        danhsach.xoa("Hòa");

        int tuoiTB = 0;
        for (int i = 0; i < 5; i++) {
            tuoiTB += sv[i].layTuoi();
        }
        System.out.println("Tuổi trung bình là: " + tuoiTB / 5);

        for (int i = 0; i < 5; i++) {
            if ((sv[i].layNgaySinh().getYear()+ 1900 ) < 1980) {
                sv[i].ganDTB(sv[i].layDTB() + 0.5);
            }
        }

    }
}
