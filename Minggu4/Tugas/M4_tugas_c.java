/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m4_tugas_c;

import java.util.Scanner;

/**
 *
 * @author M Iqbal Agung N
 */
public class M4_tugas_c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int data[];
        int banyak_data;
        
        System.out.print("Masukan banyaknya data nilai = ");
        banyak_data = input.nextInt();
        data = new int[banyak_data];

        for (int n = 0; n < banyak_data; n++){
            System.out.print("Masukan data nilai ke-" + (n+1) + " = ");
            data[n] = input.nextInt();
        }
        System.out.println("");

        int max = data[0];
        int min = data[0];
        
        for (int n = 0; n < banyak_data; n++){
            if (data[n] > max){
                max = data[n];
            }
            if (data[n] < min){
                min = data[n];
            }
        }
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maksimum = " + max);
        
        int jumlah = 0;
        float rata2;
        
        for (int n = 0; n < banyak_data; n++){
            jumlah += data[n];
        }
        rata2 = jumlah / banyak_data;
        System.out.println("Nilai rata ratanya adalah = " + rata2);
    }
    
}
