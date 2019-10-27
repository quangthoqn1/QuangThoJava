package bai4;
import java.util.*;

public class main {

    public static void main(String args[]) {
        DSSV danhsach = new DSSV(5);
        SV sv[] = new SV[5];
        sv[0] = new SV("Phạm Mạnh Bình", new Date(2000, 1, 8), 7);
        sv[1] = new SV("Nguyễn Thanh Phong", new Date(1999, 4, 5), 5);
        sv[2] = new SV("Nguyễn Quốc Hiếu", new Date(2000, 11, 30), 8);
        sv[3] = new SV("Lê Thị Ngọc Hòa", new Date(2000, 7, 8), 5.5);
        sv[4] = new SV("Phan Thị Tuyết Nga", new Date(2000, 9, 10), 6.2);

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
            if ((sv[i].layNgaySinh().getYear() + 1900) < 1980) {
                sv[i].ganDTB(sv[i].layDTB() + 0.5);
            }
        }
    }
}