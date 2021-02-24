/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdmStaff;

import ClubStaff.AdmStaff;
import ClubStaff.DepartmentStaff;
import ClubStaff.StaffType;

/**
 *
 * @author Andreia
 */
public class SupervisorAdm extends AdmStaff{

     public SupervisorAdm(String firstname, String surname, StaffType roleStaff) {
        
        super(firstname, surname,  StaffType.SUPERVISOR);
        
        
}
}
