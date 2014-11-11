/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise5;

import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cvadmin
 */
public class Startup {

    public static void main(String[] args) {

        Employee e1 = new Employee("Smith", "Jones", "111-111-1111");
        Employee e2 = new Employee("Smith", "Ray", "122-113-1111");
        Employee e3 = new Employee("Cervo", "Jose", "111-111-1111");
        Employee e4 = new Employee("Jackson", "Michael", "222-111-3333");

        Map<String, Employee> employeeMap = new HashMap<>(); //Hashmaps does not guarantee order
        employeeMap.put(e1.getSsn(), e1);
        employeeMap.put(e2.getSsn(), e2);
        //e3 replaces e1 at this key
        employeeMap.put(e3.getSsn(), e3);
        employeeMap.put(e4.getSsn(), e4);

        Employee e = employeeMap.get("222-111-3333");
        System.out.println(e);

        Set<String> keys = employeeMap.keySet();
        for (String key : keys) {
            Employee emp = employeeMap.get(key);
            System.out.println(emp);
        }
        
        Collection<Employee> values = employeeMap.values();
        for (Employee emp: values){
            System.out.println(emp);
        }
        
        List<Employee> list = new ArrayList<>(values);
        for (int i=0; i< list.size(); i++){
            Employee emp = list.get(i);
        }
        
    }
}
