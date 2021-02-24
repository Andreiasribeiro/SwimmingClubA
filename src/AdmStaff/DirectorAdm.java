/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdmStaff;

import ClubStaff.AdmStaff;
import ClubStaff.StaffType;

/**
 *
 * @author Andreia
 */
public class DirectorAdm extends AdmStaff{

     public DirectorAdm(String firstname, String surname, StaffType roleStaff) {
        
        super(firstname, surname,  StaffType.DIRECTOR);
    
}
}