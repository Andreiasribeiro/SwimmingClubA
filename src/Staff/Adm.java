/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

/**
 *
 * @author Andreia
 */
public abstract class Adm {
    //properties
    private String admName;//Adm name
    private int admID; //a unique identifier
    protected AdmType typeA; //Adm type (Director, Supervisor and Attendant)
    
    
    /**
     * 
     * @param admName the name of Adm staff
     * @param admID the ID of Adm staff
     * @param typeA the type of Adm staff
     */
    public Adm (String admName,int admID, AdmType typeA){
        
        this.admName = admName;
        this.admID = admID;
        this.typeA = typeA;
    }
    
    
    /**
     * 
     * @return the ID of Adm
     * add numbers in the Adm ID
     */
    private int generateId(){
        
        admID++;
        return admID;
    }
    
    
}
