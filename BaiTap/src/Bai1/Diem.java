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
public class Diem implements Serializable{

    private double diem1, diem2, diem3, diemTB;

    public Diem() {
    }

    public Diem(double diem1, double diem2, double diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm 1 :");
        diem1 = Double.parseDouble(sc.nextLine());
        System.out.println("Điểm 2 :");
        diem2 = Double.parseDouble(sc.nextLine());
        System.out.println("Điểm 3 :");
        diem3 = Double.parseDouble(sc.nextLine());
    }
    public double getDiemTB(){
        return (diem1+diem2+diem3)/3;
    }
    public void xuatDiem(){
        System.out.printf("%20f %20f %20f %20f",diem1,diem2,diem3,getDiemTB());
    }
}
