/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoachStaff;

import ClubStaff.CoachStaff;
import ClubStaff.StaffType;

/**
 *
 * @author Andreia
 */
public class SwimCoach extends CoachStaff {
    /**
     * 
     * @param firstname of swim coach staff
     * @param surname of swim coach staff
     */
    public SwimCoach(String firstname, String surname){
        
        super(firstname, surname, StaffType.SWIMCOACH);
    }
    
    
}
