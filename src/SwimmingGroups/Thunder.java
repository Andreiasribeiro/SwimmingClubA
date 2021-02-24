/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimmingGroups;

import Groups.GroupType;
import Groups.SwimmingGroup;

/**
 *
 * @author Andreia
 */
public class Thunder extends SwimmingGroup {
/**
 * CONCTRUCTOR
 * @param groupNum group number
 * @param swimNum number of swimmers
 * @param type group type
 */
    public Thunder(int groupNum, int swimNum, GroupType type) {
        super(groupNum, swimNum, GroupType.THUNDER);
    }

    @Override
    public String toString() {
        return "Go Thunder!!!!";
    }
    
}
