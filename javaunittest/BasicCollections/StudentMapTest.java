import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;


public class StudentMapTest {

	@Test
	public void test() {

	       Map< String,String> hm =  
	                        new HashMap< String,String>(); 
	       hm.put("Hema","Mango"); 
	       hm.put("Priya","Apple"); 
	       hm.put("Prasanth","Cheeku"); 
	       hm.put("Jaffar","Kiwi"); 
	       String name="Hema";
	  
	       // Returns Set view      
	       Set<Entry<String, String>> st = hm.entrySet();    
	  
	      
	       
	       System.out.println("printing key value pairs");
	       for (Entry<String, String> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	          
	       }
	       System.out.println("getting value by giving key");
	       for (Entry<String, String> me:st) {
	    	    String key =name.toString();
	            String value = hm.get(name).toString();  
	            System.out.println(key + " " + value);  
	            break;
	       }

	} 
	

}
