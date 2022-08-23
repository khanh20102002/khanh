/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Dona
 */
public class SinhVien extends Nguoi implements Serializable {

    private Diem diem;

    public void nhapSV() {
        super.nhapNguoi();
        System.out.println("Nhập điểm :");
        diem.nhapDiem();
    }

    public SinhVien() {
        diem = new Diem();
    }

    public SinhVien(Diem diem, String hoTen, int Tuoi, String gioiTinh) {
        super(hoTen, Tuoi, gioiTinh);
        this.diem = diem;
    }

    @Override
    public String toString() {
        super.xuatNguoi();
        diem.xuatDiem();
        return "";
    }

    public Diem getDiem() {
        return diem;
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    public static void xuatTieuDe() {
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %n", "Họ tên", "Tuổi", "Giới tính", "Điêm 1", "Diểm 2", "Điểm 3", "Điểm TB");
    }

}
