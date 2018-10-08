/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan34.objectorientedkalkulator;

import java.util.Scanner;

/**
 *
 * @author eka
 */
public class PBO6K10116599Latihan34ObjectOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Judul Aplikasi
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        Scanner scan = new Scanner(System.in);
        
        // Input angka ke-1
        System.out.print("Masukkan Angka ke-1\t: "); 
        double x = scan.nextDouble();
       
        
        // Input angka ke-2
        System.out.print("Masukkan Angka ke-2\t: ");
        double y = scan.nextDouble();
        
        kalkulator angka = new kalkulator();
        angka.isiOperan1(x);
        angka.isiOperan2(y);    
       
        
        // Output hasil
        System.out.println();
        System.out.println("Hasil Pertambahan\t: "+angka.tambah());
        System.out.println("Hasil Pengurangan\t: "+angka.kurang());
        System.out.println("Hasil Perkalian\t\t: "+angka.kali());
        System.out.println("Hasil Pembagian\t\t: "+angka.bagi());
        System.out.println("Hasil Sisa\t\t: "+angka.sisa());
    }
    
}
