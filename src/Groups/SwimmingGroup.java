/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Groups;

/**
 * Create groups with a type, a number and a number of swimmers
 * @author Andreia
 */
public abstract class SwimmingGroup {
    
    //PROPERTIES
    private int groupNum;
    private int swimNum;
    private GroupType type;
/**
 * CONSTRUCTOR
 * @param groupNum
 * @param swimNum
 * @param type 
 */
    public SwimmingGroup(int groupNum, int swimNum, GroupType type) {
        this.groupNum = groupNum;
        this.swimNum = swimNum;
        this.type = type;
    }
    
    //METHODS
    /**
     * 
     * @return the type of group
     */
    public GroupType getType() {
		
       return this.type;
    }
    /**
     * 
     * @return 
     */
    @Override 
	public String toString() {
		
		String groupInfo;
		
		groupInfo = "*********\n The group: " + this.type + this.groupNum + ", has " + this.swimNum + " swimmers \n ************ \n"; 
	
		return groupInfo;
    
}
}
