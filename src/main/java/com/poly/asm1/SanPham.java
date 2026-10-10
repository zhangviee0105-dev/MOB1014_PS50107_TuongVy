/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.asm1;
import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class SanPham {
     String maSP ;
    String tenSp;
    double donGia;
    int soLuong;
    Scanner sc = new Scanner (System.in);
    public SanPham(){
        
    }
    public SanPham (String maSP, String tenSP, double donGia, int soLuong){
        this.maSP = maSP;
        this.tenSp = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        
        
    }
    public void Nhap(){
        System.out.print("Nhap ma SP: ");
        maSP = sc.nextLine();
        System.out.print("Nhap ten SP: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.err.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        
        
    }
    public void Xuat(){
        System.out.printf("Ma SP: %s\n", maSP);
        System.out.printf("Ten SP: %s\n", tenSp);
        System.out.printf("Don gia: %.2f\n", donGia);
        System.out.printf("So luong: %d\n", soLuong);
        System.out.printf("Thanh tien: %.2f\n", thanhTien());
        
        
        
    }
    public double thanhTien(){
        
        return soLuong * donGia ;
        
    }
    public void capNhat(){
//        System.out.print("Nhap ten SP moi: \n");
//        tenSp = sc.nextLine();
//        System.out.print("Nhap don gia moi: \n");
//        donGia = sc.nextDouble();
//        System.out.print("nhap so luong moi: \n");
//        soLuong = sc.nextInt();
        
        System.out.printf("1. Sua ten: \n");
        System.out.printf("2. Sua don gia: \n");
        System.out.printf("3. Sua so luong: \n");

        System.out.print("Chon: ");
            int chon = sc.nextInt();
            sc.nextLine();

        switch (chon) {
            case 1:
                System.out.print("Nhap ten moi: \n");
                tenSp= sc.nextLine();
                break;
            case 2:
                System.out.print("Nhap don gia moi: \n");
                donGia = sc.nextDouble();
                break;
            case 3:
                System.out.print("Nhap so luong moi: \n");
                soLuong = sc.nextInt();
                break;
            default:
                break;
        }
    }
    
}
