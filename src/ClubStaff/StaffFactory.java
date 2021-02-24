/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClubStaff;

import Groups.SwimmingGroup;
import Level.LevelConstants;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Andreia
 */
public class StaffFactory {
    
    private static StaffType[] allStaffTypes;
    
    public StaffFactory() {
        
    allStaffTypes = StaffType.values();    
    }
    
    /**
     * 
     * @param dept
     * @return get randomly a staff list for Adm and Coach
     */
    public StaffMember getStaff(DepartmentStaff dept){
        
    ArrayList<StaffType> someTypes = new ArrayList<StaffType>();
    
    Random r = new Random();
    if (dept == DepartmentStaff.ADM){
        
        someTypes =  StaffType.listAdm();
    }
    
    else if (dept == DepartmentStaff.COACH){
      
        someTypes = StaffType.listCoach();
     
    }
    else {
        
    }
    return someTypes.get(r.nextInt(someTypes.size())).getStaff();
    }
    /**
     * 
     * @param type
     * @return an array StaffType
     */
    private StaffMember getStaff(StaffType type) {
        
        return type.getStaff();
    }
    /**
     * 
     * @return a list of staff departments
     */
    public String listDepartments(){
       
        String depts="";
	int counter = 1;
        
        for (DepartmentStaff d: DepartmentStaff.values()) {
          
      depts = depts.concat(counter + ": " + d.toString() + "\n");
        
        }
       return depts;
    }
/**
 * 
 * @return getStaff type
 */
    public StaffMember getStaff() {
        
        return getStaff();
    }
/**
 * 
 * @return getCoach type
 */
    public SwimmingGroup getCoach(){
        
       return getCoach();
        
    }
    /**
     * 
     * @return a random level using minCoachLevel and maxCoachLevel 
     */
    private int getRandomBikeSize() {
        
        Random r = new Random();
        
        int randomLevel =  r.nextInt(LevelConstants.maxCoachLevel);  
        
        if (randomLevel < LevelConstants.minCoachLevel){
            //makes sure it is not less than min size allowed
            randomLevel = LevelConstants.minCoachLevel;
        }
        
        return randomLevel;
        
}}


