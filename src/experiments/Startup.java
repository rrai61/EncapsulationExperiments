/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author ritu
 */
public class Startup {
    public static void main(String[] args){
        
        PersonalComputer pc = new PersonalComputer();
        pc.build("1TB", 800);
        pc.wasBuildSuccessful();
    }
}
