/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoachStaff;

import Club.CoachMember;
import Groups.GroupType;
import Groups.SwimmingGroup;
import Staff.CoachType;
import java.util.Random;

/**
 *
 * @author Andreia
 * a factory to create Coach staff
 */
public class CoachFactory {

    /**
     * 
     * @return randomly Coach staff
     */
    public SwimmingGroup getCoach(CoachType coachtype){
        
        Random r = new Random();
        
        CoachType[] coachtypes = CoachType.values();
        
        int number = r.nextInt(coachtypes.length);
        return getCoach(coachtypes[number]);
    }
        
        /**
         * default methods
         */
    public CoachFactory () {
        
    }

    public CoachMember getCoach() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
       
    }
    

