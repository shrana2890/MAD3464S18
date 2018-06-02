/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class BankAccount extends Bank {
    String AccountNumber;
    String OwnerName;
    float BalanceAmount;
    
    BankAccount()
    {
        super();
        this.AccountNumber="xxxxxxxx";
        this.OwnerName="unknown";
        this.BalanceAmount=0.0f;
    }
     BankAccount( String bankName, int bankID, String AccountNumber, String OwnerName,float BalanceAmount)
    {
        super(bankName, bankID);
        this.AccountNumber=AccountNumber;
        this.OwnerName=OwnerName;
        this.BalanceAmount=BalanceAmount;
    }
     float deposit()
     {
         float a=0.00f; 
         float b;
         a = BalanceAmount;
         System.out.println("enter money which you want to add");
         b= Float.parseFloat(in.nextLine());
         a=a+b;
         this.BalanceAmount=a;
         return 0;
             
     }
     float withdraw()
     {
         float a = 0.00f; 
         float b;
         a = BalanceAmount;
         System.out.println("enter money which you want to withdraw");
         b= Float.parseFloat(in.nextLine());
         a=a-b;
         this.BalanceAmount=a;
         return a;
             
     }
     
    @Override
     public String toString()
    {
        return(super.toString()+ "\nAccount Number :" +this.AccountNumber + "\nOwner Name"
                +this.OwnerName+ "\n balance amount:" +BalanceAmount);
    }
     
    
}
