
public class SentenceReverse {

	public String findReverseOfSentence(String string) {
		char sentence[]=string.toCharArray();
		String string1="";
		for(int counter=0;counter<sentence.length;counter++)
		{
			int temp=counter;
			while(counter<sentence.length && sentence[counter]!=' ')
			{
				counter++;
			}
			int temp2=counter-1;
			while(temp2>=temp)
			{
				string1=string1+sentence[temp2];
				temp2--;
			}
			if(counter<sentence.length)
				string1=string1+sentence[counter];
		}
		return string1;
	
	}

}
