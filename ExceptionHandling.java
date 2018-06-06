/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class ExceptionHandling {
     public static void main(String args[])
    {
    // number format exception.. int n= Int.ParseInt("123r")
        //use try bloct to find exception
        try
        {
            int n= Integer.parseInt("123r");
            System.out.println(n);
            //manaually raise exception using throw
            //set limits for exception
            if(n<150)
            {
            throw new NumberFormatException();
            }
        } 
        catch(ArithmeticException e)
        {
            System.err.println(e);
            //e.printstackTrace();
        }
        catch(NumberFormatException e)
        {
            System.err.println(e);
            //e.printstackTrace();
        }
        catch(Exception e)//use that exception at the end because it is the super class
        {
            System.err.println(e);
            //e.printstackTrace();
        } finally
        {
            System.out.println("finally block");
        }
    }
    
}
