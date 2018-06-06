/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class StringHandling {
    public static void main(String args[])
    {
        String str1= "test";
        String str2 = new String("java");
        System.out.println("str1: " +str1);
        System.out.println("str2: " +str2);
        String str3= str1+ str2;
        str3= str2.concat(str1);// concatenate
        System.out.println("str3: " +str3);
        int len= str2.length();
        System.out.println("str2 lenght: " +len);
        for(int i=0; i<str2.length();i++)
        {
            System.out.print(str2.charAt(i));// check position of char in string.. not have index
            System.out.print(str2.charAt(i)+ " ");
            System.out.print("i:" +i);
        }
       System.out.println("");
       for(int i=str2.length()-1; i>=0; i--)
        {
             System.out.print(str2.charAt(i));// check position of char in string.. not have index
            System.out.print(str2.charAt(i)+ " ");
             System.out.println("i:" +i);
        }
       str2="java";
       str3="java";
       //if(str2.equals(str3))
       if(str2.equalsIgnoreCase(str3))
       {
          System.out.println("Equal");
          
        }
        else
       {
             System.out.println(" not Equal");
          
       }
       str2="java";
       str3="java";
       System.out.println(str2.compareTo(str3));
       System.out.println(str2.endsWith("vb"));
       str2="this is test string";
       int p;
       p= str2.indexOf('i');//where i(specific char is available)
       p=str2.indexOf("test");
       System.out.println("p:"+p);
       p= str2.indexOf('i',4);//start searching from position 4
        p= str2.lastIndexOf('i');
        System.out.println(str2.replace('i', '$'));// replace i into $ in string str2
        // count no of words
        str2="this is test string";
        int wordCount=0;
        for(int i=0; i<str2.length(); i++)
        {
            if(Character.isWhitespace(str2.charAt(i)))// is white space .. check is space tab . availabvle
            {
                wordCount++;
            }
        }
        System.out.println(wordCount);
        // cant directly update string..all function only give result.. not change content of string
        //for this use StringBuffer
        StringBuffer str4= new StringBuffer("hello there");
        int leng = str4.length();
        System.out.println(str4);
        str4.append("good after");
        str4.setCharAt(1, '&');
         System.out.println(str4);
         str4.insert(1, "@@@");
         System.out.println(str4);
         //str4=(StringBuffer)"this is a boring class";
         System.out.println(str4.reverse());
          
          /* for(int i=0; i<str5.length(); i++)
        {
            String str7=null;
            if(Character.isWhitespace(str5.charAt(i)))// is white space .. check is space tab . availabvle
            {
                int q,s;
                
                q= i;
                for(int t=q;t>=0;t--)
                {
                   String str8;
                   str8 = Character.toString(str5.charAt(t));
                  // StringBuffer str7= new StringBuffer(str8.concat(str7));
                   str7=str8.concat(str7);
                }
                System.out.println(" ");
                String Str6=str5;
                //System.out.println(str5.reverse());
            }
        }*/
          //String str5="this is a test";
          String str9[] = "this is a test".split(" ");
            String fstr5=" ";​
                for(int i =str9.length-1 ; i>=0 ;i--)​
                {​
                    fstr5 +=str9[i]+" ";​
                }​
                System.out.println(fstr5);
          
    }
}
