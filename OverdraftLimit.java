/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class OverdraftLimit extends BankAccount {
    float OverdraftLimit;
    
    OverdraftLimit()
    {
        super();
        this.OverdraftLimit= 0.00f;
    }
    
    OverdraftLimit(String bankName, int bankID, String AccountNumber, 
            String OwnerName,float BalanceAmount, float OverdraftLimit)
    {
        super(bankName, bankID,AccountNumber, OwnerName, BalanceAmount);
        this.OverdraftLimit = OverdraftLimit;
  
    
   // void decision()
    //{
       float f;
       // float t;
        f= withdraw();
        if((f-this.OverdraftLimit)>0)
        {
           System.out.println("Withdraw approved");
           
        }
        else
        {
            System.out.println("Withdraw refused");
        }
        
    // }

}
}