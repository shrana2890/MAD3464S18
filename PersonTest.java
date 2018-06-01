/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class PersonTest {
    public static void main(String args[])
    {
        Person sumanth =new Person();
        sumanth.name = "Sumanth";
        sumanth.address = "Toronto";
        sumanth.age = 20;
        System.out.println("Name: " +sumanth.name +
                "\n address: " + sumanth.address +
                "\n age: " + sumanth.age);
        Person foram =new Person();
        
      //  foram.setName("foram");
        //String nm = foram.getName();
         //System.out.println("Name: " + nm);
  
         foram.setName();
        String nm= foram.getName();
        foram.setAddress();
        String add = foram.getAddress();
        foram.setAge();
        int age =foram.getAge();
         System.out.println("Name: " +nm +
                "\n address: " + add +
                "\n age: " + age);
        /* Person anu= new Person();
         anu.setData();
         System.out.println(anu.toString());
          Person aman = new Person();
          aman.setData();// if not give name= null, age=0*/
         // System.out.println(aman.toString());
          //Person rimple = new Person();
          Person rimple = new Person("Rimple", "Brampton", 22);
          System.out.println(rimple.toString());
    //if know values at a time of constructing class use  parameterised constructor
    //if wana change later on use setdata
    // rimple has sister .. means sharing same properties
     Person rimple2 = new Person(rimple);
          System.out.println(rimple2.toString());
    }
    
}
