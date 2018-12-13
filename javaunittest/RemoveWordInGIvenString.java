import java.util.StringTokenizer;
public class RemoveWordInGIvenString {

	public String RemoveWordAndSpacesInGivenString(String input,
			String wordTogetRemove,int position) {
		char sentence[]=input.toCharArray();
		String string1="";
		/*for(int counter=0;counter<sentence.length;counter++)
		{
			int temp=counter;
			while(counter<sentence.length && sentence[counter]!=' ')
			{
				counter++;
			}
			int temp2=counter-1;
			while(temp<=temp2)
			{
				string1=string1+sentence[temp];
				temp++;
			}
			
			if(counter<sentence.length)
			{
				if(sentence[counter]==' '&&sentence[counter+1]==' '&sentence[counter+2]==' ')
				{
					//string1=string1+sentence[counter];
					//counter+=2;
				}	
				else
					string1=string1+sentence[counter];
			}
				
		}*/
		  StringTokenizer st = new StringTokenizer(input, " ");
	        StringBuffer sb = new StringBuffer();
	        while(st.hasMoreElements()){
	            sb.append(st.nextElement()).append(" ");
	        }
	        string1=(sb.toString().trim());
	        String parts[] = string1.split(" ");
	        String new_sentence = "";
	        position--;
	        for(int pos=0;pos<parts.length;pos++)
	        {
	        	if(pos == position)
	        		continue;
	        	else
	        		new_sentence+=parts[pos]+" ";
	        }
	       
			return new_sentence;
	}

}
