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
public enum CoachType {
    
    HEADCHOACH,
    ASSISTANT,
    SWIMCOACH;
    
    /**
     * 
     * @return  randomly Coach type
     */
    public static CoachType getRandomCoach(){
        
        Random r = new Random();
        int Ctype =r.nextInt(CoachType.values().length);
        
        CoachType[] Coachlist = CoachType.values();
        
        return Coachlist[Ctype];
    
}
    /**
     * 
     * @return randomly HeadCoach 
     */
    public static CoachType getHeadCoach(){
        
        Random h = new Random();
        int Htype = h.nextInt(CoachType.values().length);
        
        CoachType haedlist = CoachType.HEADCHOACH;
        
        return haedlist;
}
    /**
     * 
     * @return randomly Assistant Coach 
     */
    public static CoachType getAssistantCoach(){
        
        Random h = new Random();
        int Astype = h.nextInt(CoachType.values().length);
        
        CoachType assistlist = CoachType.ASSISTANT;
        
        return assistlist;
}
    /**
     * 
     * @return randomly Swim Coach 
     */
    public static CoachType getSwimCoach(){
        
        Random h = new Random();
        int Swtype = h.nextInt(CoachType.values().length);
        
        CoachType swimtlist = CoachType.SWIMCOACH;
        
        return swimtlist;
}
}
