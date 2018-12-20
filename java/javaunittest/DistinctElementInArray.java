
public class DistinctElementInArray {

	public int findDistinctElement(int[] inputArray) {
		int element=0;
		 for(int counter=0;counter<inputArray.length-1;counter++)
	        {
	            for(int inner=counter+1;inner<inputArray.length;inner++)
	            {
	                if(inputArray[counter]>inputArray[inner])
	                {
	                    int temporary=inputArray[counter];
	                    inputArray[counter]=inputArray[inner];
	                    inputArray[inner]=temporary;
	                }
	            }
	        }
	        for(int i=0;i<inputArray.length-1;i++)
	        {
	           
	            if((inputArray[i+1]-inputArray[i])!=1)
	            {
	            	 element=inputArray[i]+1;
	  
	            }
	            	
	            	
	        }
		return element;
	}

}
