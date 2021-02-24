/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Groups;

import java.util.Random;

/**
 *
 * @author Andreia
 */
public class GroupFactory {
/**
 * 
 * @return randomly group types
 */
    public SwimmingGroup getGroup(){
        
        Random r = new Random();
        
        GroupType[] grouptypes = GroupType.values();
        
        int number = r.nextInt(grouptypes.length);
        return getGroup(grouptypes[number]);
        
     
    }
    /**
     * 
     * @param type
     * @return getGroup
     */
    public SwimmingGroup getGroup(GroupType type){
        
        return type.getGroup();
        
    }
    
    
    
}
