/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Groups;

/**
 *
 * @author Andreia
 */
public enum GroupType {
    
    STARFISH {
        @Override
        public String toString() {
            return "Starfish Group";
        }
        
        
    },
    THUNDER {
        @Override
        public String toString() {
            return "Thunder Group";
        }
      
        
    },
    CROCODILES  {
        @Override
        public String toString() {
            return "Crocodiles Group";
        }
        
        
        
    };

    SwimmingGroup getGroup() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
            
        
}
