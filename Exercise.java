/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class Exercise {
    public static void main(String args[])
    {
    for(int i=1;i<=5;i++)
{
    if( i==1)
    {
     for(int k=1;k<=5;k++)
    {
        System.out.print("*");
    }
     System.out.println(" ");
    }
    else if(i==5)
    {
     for(int k=1;k<=5;k++)
    {
        System.out.print("*");
    }
     System.out.println(" ");
    }
    else
    {
      for(int k=1;k<=5;k++)
       {
         if(k==1||k==5)
          {
          System.out.print("*");
           }
          else
             {
                 System.out.print(" ");
             }
        }
        System.out.println(" ");
    }
}
  
     int p=5;
     int q=5;
    for( int i=1;i<=5;i++)
{
   
    for(int j=1;j<=p;j++)
    {
        System.out.print(j);
    }
      for(int k=1;k<i;k++)
    {
        System.out.print(" ");
    }
    p--;
     for(int k=2;k<i;k++)
    {
        System.out.print(" ");
    }
    for( int j=q;j>=1;j--)
    {
        if(j==5)
        {
            continue;
        }
        else
        {
        System.out.print(j);
        }
    }
    q--;
    System.out.println(" ");
}
     for(int i=2;i<=5;i++)
{
for( int k=1;k<=i;k++)
{
     System.out.print(k);
}
for( int k=4;k>=i;k--)
{
     System.out.print(" ");
}
for( int k=3;k>=i;k--)
{
     System.out.print(" ");
}
for( int k=i;k>=1;k--)
{
    if(k==5)
    {
        continue;
    }
    else
    {
     System.out.print(k);
    }
}
System.out.println(" ");
}
    }
}

