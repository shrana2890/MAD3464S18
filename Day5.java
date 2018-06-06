/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
//when declare anything private.. .. cant accesss outside that file..to use that we use
//setter and getter
//protected.. are accessible in subclass and class
public class Day5 {
    public static void main(String args[])
    {
        //multiple inheritance is not supported .. 
        //create type of cycle..cant go to grand parent directly.. only single way 
        //resolve using interface
        TestA obj1 =new TestA();
        obj1.display();
        obj1.output();
        int x= obj1.number;
        System.out.println("x:" +x);
       // obj1.number=20;
        //cannot change value
        //class declared final cant be inherited.. all variables in interface are final by default
        
    }
    
}
