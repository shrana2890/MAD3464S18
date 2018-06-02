/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babu rana
 */
public class PermanentEmployee extends Employee {
     String designation;
     String experience;
     float salary;
   
    public PermanentEmployee()
            {
                super();
                this.designation = "unknown";
                this.experience = "X years";
                this.salary= 0.0f;
            }
    public PermanentEmployee(String name, String address, int age, String eID, 
            String joiningDate, int deptNo, String designation, String experience, float salary)
            {
                super(name,address, age, eID, joiningDate, deptNo);
                this.designation = designation ;
               this.experience = experience;
                this.salary= salary;
            }
    public String toString()
    {
        return(super.toString()+ "\nDesignation :" +this.designation + "\nexperience"
                +this.experience+ "\n salary: " +this.salary);
    }
   
    
}
