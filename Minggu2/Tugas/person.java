/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author M Iqbal Agung N
 */
class person_student{
    
    String fName;
    String lName;
    int stuId;
    String stuStatus;
    
    public void set(String fName, String lName, int stuId, String stuStatus){
        
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    
    public void show(){
        
        System.out.println("Student Name : " + fName + " " + lName);
        System.out.println("Student ID : " + stuId);
        System.out.println("Student Status : " + stuStatus);
    }
}

public class Person {

    public static void main(String[] args) {
        
        person_student person1 = new person_student();
        person1.set("Lisa", "Palombo", 123456789, "Active");
        person1.show();
        
    }
    
}
