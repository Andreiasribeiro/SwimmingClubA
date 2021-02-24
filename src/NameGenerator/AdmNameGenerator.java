/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NameGenerator;

/**
 *
 * @author Andreia
 */
public class AdmNameGenerator extends NameGenerator{
    
    private String[] admNames = {"Audrey", "Jack", "Georgia", "Juliet", "Lily", "Olive", "Oscar", "William", "Edward", "Alice", "Madison", "Marley"};
    private String[] admsurNames = {"Adams", "Bailey", "Murray", "Allen", "Bennett", "Hill", "Walker", "Henderson", "Phillips", "Walsh", "Morgan", "Kennedy"};
    
    /**
     * 
     */
    public AdmNameGenerator(){
   // replace firstnames and surnames Adm equivalents 
        
   this.firstNames = admNames;
   this.surNames = admsurNames;
		
    }
}
