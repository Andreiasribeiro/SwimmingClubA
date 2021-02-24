package NameGenerator;
import java.util.Random;
/**
 * create names from the array firstName and surname
 * @author Andreia
 */
public class NameGenerator {

	protected String[] firstNames = {"ken", "Tom", "Sally", "Pavel", "Priscilla", "Claudia"};
	
	protected String[] surNames = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst"};
	
	public NameGenerator() {
		
		
		
	}
	/**
         * 
         * @return  randomly name and surname
         */
	public String getRandomName() {
		//return a random name
		
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fname = this.firstNames[r.nextInt(firstNames.length)];
		String sname = this.surNames[r.nextInt(surNames.length)];
		
		return ( fname + " " + sname);
		
	}

}
