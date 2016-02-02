/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ritu
 */
public class Manager {
    
     private String status;
     private Employee employee;
     private String date;
     
     private String getCurrentDate() {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        return fmtDate;
     }
     
     public void orientNewEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee();
        date = getCurrentDate();
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        e.doOrientation("B12", date);
        employee = e;
     }
     
     public String getEmployeeStatus(){
         status = employee.getStatus(date);
         return status;
     }
     
}
