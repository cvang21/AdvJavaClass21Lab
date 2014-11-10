/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author cvadmin
 */
public class Startup {
    public static void main(String[] args) {
         Employee em = new Employee("Mouse","Mighty","123-45-6789");
         System.out.println(em); // same as System.out.println(em.toString()) Java calls the To string method implicitly
         
    }
      
}
