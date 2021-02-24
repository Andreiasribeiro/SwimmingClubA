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
public class AssistantCoach extends CoachStaff {
    /**
     * 
     * @param firstname of assistant coach staff
     * @param surname of assistant coach staff
     */
    public AssistantCoach(String firstname, String surname){
        
        super(firstname, surname, StaffType.ASSISTANT);
    }
    
}
