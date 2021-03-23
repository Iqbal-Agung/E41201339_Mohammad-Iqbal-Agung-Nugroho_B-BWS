/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3_tugas_e;

import java.util.Scanner;

/**
 *
 * @author M Iqbal Agung N
 */
public class M3_tugas_e {
    public static void main(String[] args) {
        
        String nama, menu;
        Scanner scan;
        scan = new Scanner(System.in);
        
        System.out.println("       CAFE CERIA      ");
        System.out.println("     ANEKA MINUMAN     ");
        System.out.println("-----------------------");
        System.out.println("     SPECIAL MENU :    ");
        System.out.println("    1.  Soft Drinks    ");
        System.out.println("    2.  Mix juice      ");
        System.out.println("    3.  Nescafe        ");
        System.out.println("    4.  Soda Milk      ");
        System.out.println("    5.  Tea            ");
        System.out.println("-----------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        System.out.println(" ");
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = scan.nextLine();
        
        switch (menu) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                System.out.println("Pesanan akan segera kami antar");
                break;    
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                System.out.println("Pesanan akan segera kami antar");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                break;    
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                System.out.println("Pesanan akan segera kami antar");
                break;  
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                break;   
            default:
                System.out.println("Pilihan Tidak Tersedia!");    
        }
        System.out.print("Terima Kasih " + nama + " telah berkunjung diCafe Ceria");
    }
}
