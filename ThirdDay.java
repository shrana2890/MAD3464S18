/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class ThirdDay {
    public static void main(String args[])
    {
        Arithmatic operation1= new Arithmatic();
        operation1.num1 = 20;
        System.out.println("num 1 "  +operation1.num1);
        operation1.addition();
        int sum = operation1.addition(23,45);
        System.out.println("sum=" +sum);
        float fsum= operation1.addition(123.45f, 12.12f);
        System.out.println("sum=" +fsum);
        
         int[]numbers= {10,20,30,40};
         operation1.addition(numbers);
         operation1.addition(1,2,3);
         operation1.addition(2,4,6,8,9,10,12,14,16);
    }
    
}
