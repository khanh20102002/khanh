/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.chrono.ThaiBuddhistEra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dona
 */
public class QLSV {

    public static ArrayList<SinhVien> dsSinhViens = new ArrayList<SinhVien>();
    public static Scanner sc = new Scanner(System.in);
    public static DaoSinhVien dao = new DaoSinhVien();

    private static void menu() {
        System.out.println("==================================");
        System.out.println("1. Nhập thông tin sinh viên và lưu vào tệp");
        System.out.println("2. Đọc tệp và hiển thị ");
        System.out.println("3. Hiển thị sinh viên có điểm tb lớn hơn 5 ");
        System.out.println("4. Thoát ");
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        System.out.println("QUẢN LÝ SINH VIÊN");
        do {
            menu();
            System.out.print("Lựa chọn của bạn là :");
            int luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    nhapVaLuuTep();
                    break;
                case 2:
                    docTepVaIn();
                    break;
                case 3:
                    TimKiem();
                    break;
                case 4:
                    System.out.println("BYE");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Bạn nhập sai lựa chọn rồi. mời nhập lại");
                    break;
            }
        } while (true);
    }

    private static void nhapVaLuuTep() {
        SinhVien sv = new SinhVien();
        sv.nhapSV();
        dsSinhViens.add(sv);
        DaoSinhVien dao = new DaoSinhVien();
        dao.ghiFile(dsSinhViens, "data.dat");
    }

    private static void docTepVaIn() {
        SinhVien.xuatTieuDe();
        dao.docFile("data.dat");
        Iterator<SinhVien> myIt = dsSinhViens.iterator();
        while (myIt.hasNext()) {
            System.out.println(myIt.next() + "\n");
        }
    }

    private static void TimKiem() {
        SinhVien.xuatTieuDe();
        for (int i = 0; i < dsSinhViens.size(); i++) {
            if (dsSinhViens.get(i).getDiem().getDiemTB() >= 5) {
                System.out.println(dsSinhViens.get(i).toString());
            }
        }
    }

}
