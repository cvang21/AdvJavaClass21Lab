/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise2;

import exercise3.*;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvadmin
 */
public class Startup1 {
    
    public static void main(String[] args) {        
    
    Employee e1 = new Employee("Smith", "Jones", "111-111-1111");
    Employee e2 = new Employee("Smith", "Ray", "122-113-1111");  
    Employee e3 = new Employee("Cervo", "Jose", "111-111-1111"); 
    Employee e4 = new Employee("Jackson", "Michael", "222-111-3333");
    
    List employeeList = new ArrayList();

    employeeList.add(e1);
    employeeList.add(e2);
    employeeList.add(e3);
    employeeList.add(e4);
    int size = employeeList.size();
    System.out.println("The size of the list is:" + size);
    Employee e = (Employee)employeeList.get(1);
    System.out.println(e);
    
    for(int i=0;i < employeeList.size(); i++){
        System.out.println(employeeList.get(i));
    }
    
    employeeList.remove(e1);
    employeeList.set(1,e);
    }
}
