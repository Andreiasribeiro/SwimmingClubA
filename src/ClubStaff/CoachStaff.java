/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClubStaff;

import Level.CoachLevel;

/**
 *
 * @author Andreia
 */
public class CoachStaff extends StaffMember {

    public CoachStaff(String firstname, String surname,  StaffType roleStaff, CoachLevel levelCoach) {
        
        super(firstname, surname, DepartmentStaff.COACH, roleStaff, levelCoach);
    }
    
    
    
}
