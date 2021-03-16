/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author M Iqbal Agung N
 */
public class Tugas4 {

    public static void main(String[] args) {

        String s1 ="ABC";
        String s2 = new String ("DEF");
        String s3 ="AB" + "C";
        
        System.out.println(s1.compareTo(s2)); //-3
        System.out.println(s2.equals(s3)); //false
        System.out.println(s3==s1); //true
        System.out.println(s2.compareTo(s3)); //3
        System.out.println(s3.equals(s1)); //true
  
}
}
