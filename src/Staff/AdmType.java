/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import java.util.Random;

/**
 *
 * @author Andreia
 */
public enum AdmType {
    
    DIRECTOR,
    SUPERVISOR,
    ATTENDANT;
    
    /**
     * 
     * @return randomly Adm type
     */
    public static AdmType getRandomAdm(){
        
        Random r = new Random();
        int Atype =r.nextInt(AdmType.values().length);
        
        AdmType[] admlist = AdmType.values();
        
        return admlist[Atype];
    }
    /**
     * 
     * @return randomly Director 
     */
        public static AdmType getAdmDirector(){
        
        Random r = new Random();
        int Dtype = r.nextInt(AdmType.values().length);
        
        AdmType admlist = AdmType.DIRECTOR;
        
        return admlist;
    }
        /**
         * 
         * @return randomly Supervisor 
         */
        public static AdmType getAdmSupervisor(){
        
        Random r = new Random();
        int Atype = r.nextInt(AdmType.values().length);
        
        AdmType admlist = AdmType.SUPERVISOR;
        
        return admlist;
    }
          /**
           * 
           * @return randomly Attendant 
           */
       public static AdmType getAdmAttendant(){
        
        Random r = new Random();
        int Atype = r.nextInt(AdmType.values().length);
        
        AdmType admlist = AdmType.ATTENDANT;
        
        return admlist;
    }
/**
 * 
 * @return
 * default 
 */
    Adm getAdm() {
              
        return null;
       
        
    }
}
