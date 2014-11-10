/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise2;

import java.util.ArrayList;
import java.util.List;
import common.Employee;

/**
 *
 * @author cvadmin
 */
public class Startup {
    public static void main(String[] args) {
        
        //Declare the list using the LSP.
        List employeeList = new ArrayList(); 
        //Create a list without using Generics and Add Four Employee Objects
        
        
        employeeList.add(new Employee("Thedog","Lassie","111-11-1111"));
        employeeList.add(new Employee("Hanks","Tom","111-11-1111"));
        employeeList.add(new Employee("Pan","Peter","222-11-2424"));
        employeeList.add(new Employee("Presley","Elvis","333-33-2626"));
        
        //Display the size of the ArrayList
        System.out.println("The size of your list is " + employeeList.size());
        
        //Retrieve the 2nd item in the Employee List
        Employee e2 = (Employee)employeeList.get(1);
        System.out.println("The second element in the list " + e2);
        
        
        //Using Old Style For Loop display the contents of the Array List
        System.out.println("Contents of the whole Employee List");
        for(int i=0; i < employeeList.size(); i++) {
        Employee s = (Employee)employeeList.get(i);
        System.out.println(s);
        }
        
        System.out.println("Clear Items in Array Feature");
        employeeList.clear();
        
        //Using New style Loop, display the contents of the list
        for (Object employeeList1 : employeeList) {
            Employee s = (Employee) employeeList1;
            System.out.println(s.toString());
        }

    }
}
