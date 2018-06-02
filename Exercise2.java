/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class Exercise2 {
       public static void main( String[] args)
       {
           BankAccount bA1= new BankAccount("SCOTIA",121, "BA1", "RASHMI", 400.0f);
           System.out.println(bA1.toString());
           OverdraftLimit oL1 = new OverdraftLimit("ICICI", 133, "OL1", "PRABH", 2000.0f, 1000.0f);
           System.out.println(oL1.toString());
           
       }
    
}
