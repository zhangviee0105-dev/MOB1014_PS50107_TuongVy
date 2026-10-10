/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.llab1;
import java.util.Scanner;
/**
 *
 * @author TUONG VY
 */
public class hinhtamgiac {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double a, b, c, cv, dt;
        System.out.print("Nhap canh a: ");
        a = sc.nextDouble();
        System.out.print("nhap canh b: ");
        b = sc.nextDouble();
        System.out.print("nhap canh c: ");
        c = sc.nextDouble();
        cv = a+b+c;
        System.out.printf("Chu vi hinh tam giac: %.2f", cv);
                
        
    }
}
