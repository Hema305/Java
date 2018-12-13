
public class DuplicateRemovedString {

	public String removeChar(String input) {
		String afterRemovalOfDuplicates=new String();
		int size=input.length();
		for(int counter=0;counter<size;counter++)
		{
			if(!afterRemovalOfDuplicates.contains(String.valueOf(input.charAt(counter))))
			{
				afterRemovalOfDuplicates+=String.valueOf(input.charAt(counter));
			}
		}
		/*for(int i=0;i<chars.length;i++)//sorting
		{
			char temp=' ';
			for(int j=i+1;j<chars.length;j++)
			{
				if(chars[i]>chars[j])
				{
					
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
				}
			}
		}
		int tempTwo=0;
		for(int i=0;i<chars.length-1;i++)
		{
			if(chars[i]!=chars[i+1])
			{
				chars[tempTwo]=chars[i];	
				tempTwo++;
			}
		}
		chars[tempTwo]=chars[chars.length-1];
		char newArray[]=new char[tempTwo+1];
		for(int i=0;i<newArray.length;i++)
		{
			newArray[i]=chars[i];
		}
		String str=new String(newArray);
		return str;*/
		return afterRemovalOfDuplicates;
	}
}
