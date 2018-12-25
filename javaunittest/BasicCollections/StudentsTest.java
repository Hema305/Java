import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



import java.util.TreeSet;

import org.junit.Test;
/**
 * 
 * @author hemalatha M
 *
Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection is maintaining the order that you add.
 */

public class StudentsTest {
private Students studentDetails;
private LinkedHashSet<String> studentsNames=new LinkedHashSet<String>();//LinkedHashSet is used for maintain Insertion order
	@Test
	public void studentDetailsIngivenOrderTest() {
		
		studentsNames.add("Hemalatha");
		studentsNames.add("Priyanka");
		studentsNames.add("Sailaja");
		studentsNames.add("Kanak");
		studentsNames.add("Raghadeep");
		studentsNames.add("Bhanu");
		 // create an iterator
	      Iterator iterator =studentsNames.iterator(); 

	      System.out.println("*****insertion oder*****");
	      // check values	      
	      while (iterator.hasNext()) {
	    	
	         System.out.println(iterator.next());  
	      }
	}
	@Test
	public void studentDetailsInNaturalOrderTest() {
		TreeSet<String> namesInorder=new TreeSet<String>();	//Used TreeSet for natural order
		namesInorder.add("Hemalatha");
		namesInorder.add("Priyanka");
		namesInorder.add("Sailaja");
		namesInorder.add("Kanak");
		namesInorder.add("Raghadeep");
		namesInorder.add("Bhanu");
		 // create an iterator
	      Iterator iterator =namesInorder.iterator(); 
	      System.out.println("*****ascending oder*****");
	      // check values
	      while (iterator.hasNext()) {
	    	 
	         System.out.println(iterator.next());  
	      }
	}


	

}
