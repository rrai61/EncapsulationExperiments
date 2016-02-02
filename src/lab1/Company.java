/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ritu
 */
public class Company {
    private Manager m;
    
    public Company() {
        m = new Manager();
    }
    
    public void orientNewEmployee(String firstName, String lastName, String ssn){
        m.orientNewEmployee(firstName, lastName, ssn);
    }
    
    public String getEmployeeStatus(){
        return m.getEmployeeStatus();
    }
}   

