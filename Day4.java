/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class Day4 {
    public static void main(String args[])
    {
        //T0D0 code application logic here
       Employee emp1 = new Employee("rutvi", "tornto", 23,"E101", "12 MAY 2017",10);
      // Employee emp1 = new Employee ("name:" +emp1.name+ "\n address :" +emp1.address+
           //   "\n age:"+emp1.age+ "E101", "12 MAY 2017", 10);
//        emp1.name = "rutvi";
        //emp1.address = "toronto";
       // emp1.age = 23;
       //System.out.println("Name :" +emp1.name+ "\naddress :" +emp1.address+"\nage" +emp1.age);
        System.out.println(emp1.toString());
        TemporaryEmployee tE1 = new TemporaryEmployee("Sukhwinder","brampton",22,"t123", 
                "01 May 2018", 20, "ios developer", 80.50f);
        System.out.println(tE1.toString());
        PermanentEmployee pE1 = new PermanentEmployee("rashmi","brampton",22,"p123", 
                "01 april 2017", 21, "ios developer","2 years", 80.50f);
        System.out.println(pE1.toString());
        
    }
    
}
