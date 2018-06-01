
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
public class Person {
    String name;
    String address;
    int age;
    Scanner in =new Scanner(System.in);
    // default constructer== for setting default values
    //name of constructor same as class
  //if not used name=null, age =0;
    Person()
            {
            name="Unknown";
            address ="Unknown";
            age = 1;
            }
    //construct which can accept some parameter called parameterised cons
    Person(String name, String address, int age)
    {
        this.name= name;// refering outside name
           this.address = address;
             this.age= age;
    }
    // for object sharing same properties
    Person (Person anotherPerson )// anotherperson=copy constructor
    {
        this.name= anotherPerson.name;
        this.address = anotherPerson.address;
        this.age= anotherPerson.age;
    }
 /*   void setName(String nm)// for set value// setter funtion
    {
        name = nm;
    }*/
    //enter name by client
void setName()
{
    
    System.out.println("Enter Name: ");
name= in.nextLine();
}
    String getName() 
{
    return name;
}
    void setAddress()
    {
      System.out.println("Enter address: ");
address= in.nextLine();  
    }
    String getAddress() 
{
    return address;
}
    void setAge()//Wrapper calss ..function like conversion into into string ege etc 
    {
      System.out.println("Enter age: ");
      age = Integer.parseInt(in.nextLine());  //nextline always give string
    }
    int getAge() 
{
    return age;
}
    //set only set only 1 attribute at a time
    void setData()
    {
        setName();
        setAddress();
        setAge();
        
    }
    //toString convert into string.. we are overriding tostring and adding own values
    @Override
    public String toString(){
        String data= "Name : " + name + "\n address : " + address + "\n age :" +age;
        return data;
    }
   
    
}

