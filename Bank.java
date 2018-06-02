
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class Bank {
    String bankName;
    int bankID;
    Scanner in =new Scanner(System.in);
    
    Bank()
    {
        this.bankName="xxxxxx";
        this.bankID= 0;
    }
         Bank(String bankName, int bankID)
    {
        this.bankName=bankName;
        this.bankID= bankID;
    }    
 
    void setbankName()
{
    
    System.out.println("Enter Bank Name: ");
    bankName= in.nextLine();
}
    String getbankName() 
{
    return bankName;
}
     void setbankID()//Wrapper calss ..function like conversion into into string ege etc 
    {
      System.out.println("Enter age: ");
      bankID = Integer.parseInt(in.nextLine());  //nextline always give string
    }
    int getbankID() 
{
    return bankID;
}
    void Data()
    {
        setbankName();
        setbankID();
        
    }
     @Override
    public String toString(){
        String Data= "bankName : " + bankName + "\n bank id :" +bankID;
        return Data;
    }
}
