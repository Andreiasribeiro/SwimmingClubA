/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NameGenerator;

/**
 * Generate names for coach staff
 * @author Andreia
 */
public class CoachNameGenarator extends NameGenerator  {
    
    private String[] admNames = {"Oliver", "Jack", "Amelia", "Liam", "Michael", "Morris", "Susan", "Damian", "Rhys", "Ethan", "Joe", "Jessica"};
    private String[] admsurNames = {"King", "Thompson", "Collins", "Carter", "Armstrong", "Morris", "Wilson", "Henderson", "Phillips", "Walsh", "McDonald", "Lawrence"};
    
    public CoachNameGenarator(){
   // replace firstnames and surnames coach equivalents 
        
   this.firstNames = admNames;
   this.surNames = admsurNames;
}
}
