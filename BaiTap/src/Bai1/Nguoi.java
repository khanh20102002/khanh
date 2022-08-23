/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Dona
 */
public class Nguoi {

    private String hoTen;
    private int Tuoi;
    private String gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int Tuoi, String gioiTinh) {
        this.hoTen = hoTen;
        this.Tuoi = Tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhapNguoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên :");
        hoTen = sc.nextLine();
        System.out.println("Nhập tuổi:");
        Tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính :");
        gioiTinh = sc.nextLine();
    }
    public void xuatNguoi(){
        System.out.printf("%20s %20d %20s ",hoTen,Tuoi,gioiTinh);
    }
}
