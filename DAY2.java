/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class DAY2 {
    public static void main(String args[])
    {
        int n1 = 11;
        if (n1%2==0)
        {
            System.out.println("even");

        }
        else
        {
            System.out.println("odd");

        }
  char pass ='a';
  switch(pass)
  {
      
    case 'a' :   
    case 's' :
    case 'o' :
        
        
    System.out.println("pass: valid pass");
               break;
      
   /* case 'a' :
               System.out.println("adult pass: valid pass");
               break;
        case 's':
               System.out.println("student pass: valid pass");
               break;
        case 'o':
               System.out.println("old pass: valid pass");
               break;
               default:
                System.out.println("invalid pass");
               break;
}*/
           default:
                System.out.println("invalid pass");
               break;    
  }
  switch(10+20){
      case 10: 
           System.out.println("value is 10");
               break;
       case 20: 
           System.out.println("value is 20");
               break;
       case 30: 
           System.out.println("value is 30");
               break;
       default:
                System.out.println("invalid value");
               break;
  }
  String province = "ON";
  switch(province)
  {
      case "NV":
          System.out.println("state is NOVA SCOTIA");
               break;
              case "ON":
          System.out.println("state is ONTARIO");
               break;
               case "MN":
          System.out.println("state is MONTREAL");
               break;
               default:
                System.out.println("invalid state");
               break;
  }
/*  while(n1>10)
  {
      System.out.println("value of n1 is " + n1);
   n1--;
   */
 n1 = 20;
while(n1>10)
  {
      //System.out.println("value of n1 is " + n1);
   n1--;

  }
do
{
   System.out.println("value of n1 is " + n1);
   n1--;
}while(n1>10);//valuse is 10 not 11;
/*for(int i=0;i<5;i++)
{
    
System.out.println("value of i is " + i);
    }*/
/*for(int i=0;i<5;)
{
    
System.out.println("value of i is " + i++);
    }*/
/*int i=0;
for(;i<5;)
{
    
System.out.println("value of i is " + i++);
    }*/
int i=0;
/*for(;;)
{
    if(i<5)
    {
System.out.println("value of i is " + i++);
    }
    else if (i==3)
    {
    continue;
    }
    else 
    {
        break;
    }
    }*/
/*for(i=1;i<5;i++)
{
    if(i==3)
    {
        continue;
    }
    else
    {
System.out.println("value of i is " + i);
    }
    }
*/
/*for(i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println("");
}*/

/*for(i=1;i<=5;i++)
{
    for(int j=5;j>i;j--)
    {
    
        System.out.print(" ");
   
    }
    for(int k=1;k<=i;k++)
    {
        System.out.print("* ");
    }
    System.out.println("");
}*/
for(i=1;i<=5;i++)
{
     for(int k=1;k<i;k++)
    {
        System.out.print(" ");
    }
    for(int j=5;j>=i;j--)
    {
    
        System.out.print("* ");
   
    }
   
    System.out.println("");
}
int numbers[] =new int[5];
numbers[0]= 10;
System.out.println("number [0] " + numbers[0]);

/*for(i=0;i<5;i++)
{
    numbers[i] = (i+1);
    System.out.println("number ["+i+"] " + numbers[i]);
}*/

//function used math.pow
for(i=0;i<5;i++)
{
    numbers[i] = (int)Math.pow((i+1),2);
    System.out.println("number ["+i+"] " + numbers[i]);
}
//multiply array data by 10
//numbers.lenght=== describe length of array

for(i=0;i<numbers.length ;i++)
{
    //numbers[i] = (int)Math.pow((i+1),2);== only display not change
    System.out.println("value" +(i+1)+ ":" + numbers[i]*10);
}

// int no: numbers== automatically allocate value of array into variable no.. but in last no= last array data
for ( int value : numbers)
{
    System.out.println("number :" + value); 
}

int table[][] = new int[5][3];
        for(int row=0;row<5;row++)
        {
            for(int col=0;col<3;col++)
            {
                table[row][col]= row+col;
                System.out.print(table[row][col]); 
            }
System.out.println("");
        }
 
 for(i=1;i<=5;i++)
{
    if( i==1 || i==5)
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
    for(i=1;i<=5;i++)
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
     for(i=2;i<=5;i++)
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