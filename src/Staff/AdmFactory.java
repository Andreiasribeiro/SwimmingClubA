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
 * a factory to create Adm staff
 */
public class AdmFactory {
    /**
     * 
     * @return randomly Adm staff
     */
    public Adm getAdm() {
        
        Random r = new Random();
        
        AdmType[] typesAdm = AdmType.values();
        
        int number = r.nextInt(typesAdm.length);
        
        return getAdm(typesAdm[number]);
    }
    
    /**
     * 
     * @param typesAdm
     * @return Adm type
     */
    public Adm getAdm(AdmType typesAdm) {
		
		return typesAdm.getAdm();
	}
    
}
