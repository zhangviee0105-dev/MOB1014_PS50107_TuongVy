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
public class hinhchunhat {
    public static void main(String[] args){
        Scanner jk = new Scanner(System.in);
        double cv, dt;
        System.out.print("Nhap chieu dai: ");
        double dai = jk.nextDouble();
        System.out.print("nhap chieu rong: ");
        double rong = jk.nextDouble();
        cv = (dai + rong)*2;
        dt = dai * rong;
        System.out.printf("dien tich hinh chu nhat =%.2f\n Dien tich hinh chu nhat =%.2f", cv, dt);
       
        
        
        //double dai = sc.nextDouble();
        //System.out.print("chieu rong hinh chu nhat: ");
        //double rong = sc.nextDouble();
        //double dienTich = dai*rong;
        //double chuVi = (dai+rong)*2;
        //System.out.printf("Dien tich hinh chu nhat = %.2f%n",  dienTich);
        //System.out.printf("Chu vi hinh chu nhat= %.2f%n", chuVi);
        
        
        
        
    }
    
    
    
}
