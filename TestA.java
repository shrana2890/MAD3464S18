/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
//public class TestA implements A{
//take data from 2 methods A and B is done by interface
public class TestA extends TestC implements A, B, C{
//inhritance with interface
    @Override
   public void display()// method in A is public/ by default it is default..
           //...create it public
            {
       System.out.println("number: " +number);
                // default is accesible within that package
                //public is accessible in entire project
               
            }
   public void show()
   {
       System.out.println("B ");
   }
   public void output()
   {
       System.out.println("C" );
   }
}
