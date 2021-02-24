/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClubStaff;

/**
 * All staff member have name, surname, individual ID (start in 1), Department and role
 * @author Andreia
 */
public class StaffMember {
    //Properties
        private String firstname;
	private String surname;
	private int staffID;
	private DepartmentStaff deptStaff;
	private StaffType roleStaff;
        
        private static int currentStaffNumber = 1; //ID badge unique
        
        
/** CONSTRUCTOR
 * to create a Staff member with all information
 * @param firstname
 * @param surname
 * @param staffID
 * @param deptStaff
 * @param roleStaff 
 */
    public StaffMember(String firstname, String surname, int staffID, DepartmentStaff deptStaff, StaffType roleStaff) {
        this.firstname = firstname;
        this.surname = surname;
        this.staffID = staffID;
        this.deptStaff = deptStaff;
        this.roleStaff = roleStaff;
    }
        
    /** METHODS
     * 
     * @return 
     */
 private int generateIDBadge() {
	
  this.currentStaffNumber++;
  return this.currentStaffNumber;
 }
 
 
/**
 * 
 * @return the full Staff name
 */
@Override
public String toString() {
		
return this.firstname + " " + this.surname;
	
}
	
/**
 * 
 * @return the role
 */
public StaffType getRole() {
    
return this.roleStaff;
	}
/**
 * 
 * @return the first name
 */	
public String getfirstName() {

    return this.firstname;
	}
/**
 * 
 * @return the surname
 */	
public String getSurname() {
		
return this.surname;
	}
}

