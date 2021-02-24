/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClubStaff;

import java.util.ArrayList;

/**
 *
 * @author Andreia
 */
public enum DepartmentStaff {
    
    ADM {
        @Override
        public String toString() {
            return "Admin Department"; 
        }

        @Override
        public StaffMember getStaff(StaffType type) {
            
            return type.getStaff();
        }
        @Override
        public ArrayList<StaffType> listAllTypes() {
            
            return StaffType.listAdm();
        }
            
        
        
        
    },
    
    COACH {
        @Override
        public String toString() {
             return "Coach Department"; 
        }

        @Override
        public StaffMember getStaff(StaffType type) {

             return type.getStaff();
        }
  
        @Override
        public ArrayList<StaffType> listAllTypes() {
    
         return StaffType.listCoach();
    }
    };
    
    //@return a StaffMmeber of a specific type
	public abstract StaffMember getStaff(StaffType type);
	
	
	public abstract ArrayList<StaffType> listAllTypes();
	
	public abstract String toString();
    
}
