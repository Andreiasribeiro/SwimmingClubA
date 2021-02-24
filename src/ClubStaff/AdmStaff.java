/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClubStaff;

/**
 *
 * @author Andreia
 */
public class AdmStaff extends StaffMember {

    public AdmStaff(String firstname, String surname,  StaffType roleStaff) {
        
        super(firstname, surname, DepartmentStaff.ADM, roleStaff);
    }
 }
