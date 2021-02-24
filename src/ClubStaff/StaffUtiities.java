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
public class StaffUtiities {
    
    private static StaffType[] allStaffTypes;
    
    /**
     * 
     */
    public StaffUtiities (){
        
      allStaffTypes = StaffType.values();  
    }
   /**
    * 
    * @return 
    */
    public static String listStaffTypes(){
        
        String allStaff="";
	int counter = 1;
        
        
        for(StaffType s: allStaffTypes){
            
        allStaff = allStaff.concat(counter + ": " + s.toString() + "\n");
        
	counter++;    
        }
        
        return allStaff;
    }
    /**
     * 
     * @param dept
     * @return 
     */
    public static String listTypeByDepartment(DepartmentStaff dept){
        
        String typeString ="";
        int count = 1;
        
        for (StaffType s: allStaffTypes){
            
        if (s.whichDept() == dept){
            
     typeString = typeString.concat(count + ": " + s.toString() + "\n");
     
     count++;
     
        }  
        }
        return typeString;
        
        }
        /**
         * 
         * @param staffList
         * @param dept
         * @return 
         */
        public static ArrayList<StaffMember> listStaffByDepartmentStaff (ArrayList<StaffMember> staffList, DepartmentStaff dept){
            
            ArrayList<StaffMember> specificList = new ArrayList<StaffMember>();
          
            for(StaffMember s: staffList) {
                
             if(s.getRole().whichDept() == dept){
                 
                 specificList.add(s);
             } 
            }
             return specificList;
            }
            /**
             * 
             * @param staffList
             * @param role
             * @return 
             */
        public static ArrayList<StaffMember> listStaffByRole (ArrayList<StaffMember> staffList, StaffType role){
            
            ArrayList<StaffMember> specificList = new ArrayList<StaffMember>();
            
            for(StaffMember s: staffList){
            
            if(s.getRole() == role){
                
            specificList.add(s);
            
            }
            
            }
            return specificList;
        }
        
        
        
        }
    

