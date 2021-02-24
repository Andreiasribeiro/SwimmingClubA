/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Club;

import ClubStaff.StaffFactory;
import ClubStaff.StaffMember;
import CoachStaff.CoachFactory;
import Groups.GroupFactory;
import Groups.SwimmingGroup;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andreia
 */
public class MembersClub {

    private ArrayList<SwimmingGroup> groups;
    private ArrayList<StaffMember> staffList;
    private ArrayList<CoachMember> coachList;

    public MembersClub() {
        
       this.groups = new ArrayList<SwimmingGroup>();
       addGroup();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MembersClub myMembersClub = new MembersClub();
    }
    /**
     * Create randomly 50 groups
     */
       private void addGroup(){
           
           Random r = new Random();
           GroupFactory myGroupFactory = new GroupFactory();
           
           for (int i=0; i<50; i++){
           
               SwimmingGroup mySwimmingGroup = myGroupFactory.getGroup();
               
               this.groups.add(mySwimmingGroup);
               
       }
        for( SwimmingGroup s: groups) {
			
			System.out.println(s.toString());
		}
        
        
    }
       /**
        * Create randomly 10 Adm staff
        */
        private void addAdm(){
           
           Random r = new Random();
           StaffFactory myStaffFactory = new StaffFactory();
           
           for (int i=0; i<10; i++){
           
               StaffMember myStaffMember = myStaffFactory.getStaff();
               
               this.staffList.add(myStaffMember);
               
       }
        for( StaffMember s: staffList) {
			
			System.out.println(s.toString());
		}
    
}
        /**
         * Create randomly 30 coach staff
         */
        private void addCoach(){
           
           Random r = new Random();
           CoachFactory myCoachFactory  = new CoachFactory ();
           
           for (int i=0; i<30; i++){
           
               CoachMember myCoachMember = myCoachFactory .getCoach();
               
               this.coachList.add(myCoachMember);
               
       }
        for( CoachMember s: coachList) {
			
			System.out.println(s.toString());
		}
    
}
}
