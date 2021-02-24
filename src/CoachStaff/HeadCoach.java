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
public class HeadCoach extends CoachStaff {
    /**
     * 
     * @param firstname of head coach staff
     * @param surname of head coach staff
     */
    public HeadCoach(String firstname, String surname){
        
        super(firstname, surname, StaffType.HEADCOACH);
    }
    
    
}
