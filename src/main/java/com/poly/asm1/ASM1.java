/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.asm1;

/**
 *
 * @author TUONG VY
 */
public class ASM1 {

    public static void main(String[] args) {
        
        SanPham sp = new SanPham();
        sp.Nhap();
        System.out.printf("THONG TIN SAN PHAM\n");
        sp.Xuat();
        System.out.printf("ban muon cap nhat \n");
        sp.capNhat();
        
        sp.Xuat();
    }
    
}
