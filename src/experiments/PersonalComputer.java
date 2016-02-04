/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

import javax.swing.JOptionPane;

/**
 *
 * @author ritu
 */
public class PersonalComputer {
    private HardDrive hdd;
    private PowerSupply psu;
    private boolean hdInstalled;
    private boolean psuInstalled;
    
    public void build(String capacity, int watts){
        installHardDrive(capacity);
        installPowerSupply(watts);
    }
    
    private void installHardDrive(String hdd){
        if(hdd == null || hdd.length() == 0){
            JOptionPane.showMessageDialog(null,
                    "Error: hard drive cannot be null or empty string");
            System.exit(0);
        }
        hdInstalled = true;
        System.out.println("Hard Drive is installed.");
    }
    
    private void installPowerSupply(int watts){
        if(watts <= 0 || watts > 1500) {
            JOptionPane.showMessageDialog(null,
                    "Error: watts cannot be 0 or greater than 1500");
            System.exit(0);
        }
        psuInstalled = true;
        System.out.println("Power Supply is installed.");
    }
    
    public void wasBuildSuccessful(){
        if(hdInstalled && psuInstalled){
        System.out.println("Build was successful.");
        }
    }
}
