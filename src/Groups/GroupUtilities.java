/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Groups;

import java.util.ArrayList;

/**
 *
 * @author Andreia
 */
public class GroupUtilities {

    /**
     * methods for generate list
     */
    public GroupUtilities() {
        /**
         * methods to generate lists
         * @return list  of groups 
         */
        public static String listGroupTypes(){
            
            String list = "";
            GroupType[] types = GroupType.values();
            
            for( int counter = 0; counter<types.length; counter++){
                
                list = list.concat((counter + 1) + ": " + types[counter].toString() + "s \n");
                
                
            }
            return list;
        }
        /**
         * 
         * @param allGroups of swimmers
         * @param type of groups
         * @return array list of groups
         */
        public static ArrayList<SwimmingGroup> listGroupsByType(ArrayList<SwimmingGroup> allGroups, GroupType type){
            
            ArrayList<SwimmingGroup> resultList = new ArrayList<SwimmingGroup>();
            
            for (SwimmingGroup a: allGroups){
                
                if( a.getType() == type){
                    
                    resultList.add(a);
                }
            }
            return resultList;
        }
    }
    


    


