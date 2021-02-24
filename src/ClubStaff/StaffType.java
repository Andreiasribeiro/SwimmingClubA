/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClubStaff;

import CoachStaff.Coach;
import NameGenerator.NameGenerator;
import java.util.ArrayList;

/**
 *
 * @author Andreia
 */
public enum StaffType {

    HEADCOACH {
        /**
         * 
         */
        @Override
        public StaffMember getStaff(){
            
          NameGenerator NG = new NameGenerator();
          
          String[] name = generateName();
          
          return new Coach(name[0],name [1]);
        }
        /**
         * 
         */
        @Override
        public DepartmentStaff whichDept() {
            
            return DepartmentStaff.COACH;
            
        }
        /**
         * 
         */
        @Override
        public String toString(){
            
            return "Head Coach";
    }
    },
    ASSISTANT {
        /**
         * 
         */
        @Override
        public StaffMember getStaff(){
            
          NameGenerator NG = new NameGenerator();
          
          String[] name = generateName();
          
          return null;
        }
        /**
         * 
         */
        @Override
        public DepartmentStaff whichDept() {
            
            return DepartmentStaff.COACH;
            
        }
        /**
         * 
         */
        @Override
        public String toString(){
            
            return "Assistant Coach";
        
        }
    },
    SWIMCOACH {
        /**
         * 
         */
        @Override
        public StaffMember getStaff(){
            
          NameGenerator NG = new NameGenerator();
          
          String[] name = generateName();
          
          return new Swim(name[0],name [1]);
        }
        /**
         * 
         */
        @Override
        public DepartmentStaff whichDept() {
            
            return DepartmentStaff.COACH;
            
        }
        /**
         * 
         */
        @Override
        public String toString(){
            
            return "Swim Coach";
       
    }
    },
    DIRECTOR {
                
        /**
         * 
         */
        @Override
        public StaffMember getStaff(){
            
          NameGenerator NG = new NameGenerator();
          
          String[] name = generateName();
          
          return new Director(name[0],name [1]);
        }
        /**
         * 
         */
        @Override
        public DepartmentStaff whichDept() {
            
            return DepartmentStaff.ADM;
            
        }
        /**
         * 
         */
        @Override
        public String toString(){
            
            return "Adm Director";
        
        
    }
    },
    ATTENDANT{
        
        /**
         * 
         */
        @Override
        public StaffMember getStaff(){
            
          NameGenerator NG = new NameGenerator();
          
          String[] name = generateName();
          
          return new Attendant(name[0],name [1]);
        }
        /**
         * 
         */
        @Override
        public DepartmentStaff whichDept() {
            
            return DepartmentStaff.ADM;
            
        }
        /**
         * 
         */
        @Override
        public String toString(){
            
            return "Adm Attendant";
              
    }
    },
    SUPERVISOR {
        
        /**
         * 
         */
        @Override
        public StaffMember getStaff(){
            
          NameGenerator NG = new NameGenerator();
          
          String[] name = generateName();
          
          return new Supervisor(name[0],name [1]);
        }
        /**
         * 
         */
        @Override
        public DepartmentStaff whichDept() {
            
            return DepartmentStaff.ADM;
            
        }
        /**
         * 
         */
        @Override
        public String toString(){
            
            return "Adm Supervisor";
        }
    };

    static ArrayList<StaffType> listAdm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static ArrayList<StaffType> listCoach() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    /**
     * 
     * @return 
     */
    public abstract StaffMember getStaff();
	
    public abstract String toString();
	
    public abstract DepartmentStaff whichDept();
	
    private static String[] generateName() {
        
        NameGenerator NG = new NameGenerator();
        String name = NG.getRandomName()
                
        return name.split(" ");
        
    }
    /**
     * 
     * @return 
     */
    public static ArrayList<StaffType> listAdmins(){
        
        StaffType[] allTypes = StaffType.values();
        ArrayList<StaffType> coach = new ArrayList<StaffType>();
        
        for (StaffType t: allTypes){
            
            if(t.whichDept() == DepartmentStaff.COACH) {
                coach.add(t);
        }
        
    }
    return coach;
} 
    /**
     * 
     * @return 
     */
    public static ArrayList<StaffType> listMedical(){
        
        StaffType[] allTypes = StaffType.values();
        ArrayList<StaffType> adm = new ArrayList<StaffType>();
        
        for (StaffType t: allTypes){
            
            if(t.whichDept() == DepartmentStaff.ADM){
                
                adm.add(t);
        }
    }
   return adm;
    } 
}
    
    

    

