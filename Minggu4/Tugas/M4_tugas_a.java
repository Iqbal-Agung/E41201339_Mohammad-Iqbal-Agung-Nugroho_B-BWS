/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m4_tugas_a;

import java.util.Scanner;

/**
 *
 * @author M Iqbal Agung N
 */
public class M4_tugas_a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Batas awal bilangan = ");
        int awal = input.nextInt();
        System.out.print("Batas akhir bilangan = ");
        int akhir = input.nextInt();

        System.out.print("Bilangan genap = ");
        for (int n = awal; n <= akhir; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    
}
