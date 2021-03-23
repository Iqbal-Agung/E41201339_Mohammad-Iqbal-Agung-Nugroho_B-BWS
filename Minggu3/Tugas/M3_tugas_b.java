/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3_tugas_b;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author M Iqbal Agung N
 */
public class M3_tugas_b {
    public static void main(String[] args) {
        
        int deret;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Jumlah deret array : ");
        deret = scan.nextInt();
        
        for (int n = 0; n <= deret - 1; n++){
            int[] acak = new int[deret];
            acak[n] = random.nextInt(999);
            System.out.print(acak[n] + " ");
        }
        System.out.println(" ");
    }
    
}
