/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Day4; 
/**
 *
 * @author babu rana
 */
// employee have same properties of person class
public class Employee extends Person {
    String eID;
    String joiningDate;
    int deptNo;
    
    
    Employee()
    {
        super();//repesent super class ..only behave as sub class of extends
        this.eID = "E###";
        this.joiningDate = "DD MON YYYY";
        this.deptNo= 0;
    
    }
    //Employee(String eID, String joiningDate , int deptNo)
    Employee( String name, String address, int age,String eID, String joiningDate , int deptNo)
    {
        super(name, address, age);
        this.eID = eID;
        this.joiningDate = joiningDate;
        this.deptNo= deptNo;
    }
    
    @Override
    public  String toString()
    {
        String personalDetails = super.toString();
        String data = "Employee ID : " +this.eID+
                "\n joining data :" +this.joiningDate+
                "\n Dept No: "+this.deptNo;
        return personalDetails+data;
    }
   

}
