
public class StringPalindrome {
	String palindromes[]=new String[10];
	public String[] checkPlaindrome(String[] names) {
		int newCounter=0;
		int descCount=0;
		
		for(int counter=0;counter<names.length;counter++)
		{
			String temporaryName="",reverse="";
			
			temporaryName=names[counter];
			int length=temporaryName.length();
			  for (int wordlength = length - 1; wordlength >= 0; wordlength--)
			  {
				  reverse = reverse + temporaryName.charAt(wordlength);
			  }
			  if(temporaryName.equals(reverse))
			  {
				 palindromes[newCounter]=names[counter];
				 newCounter++;
			  }
		}
			  String[] s=new String[newCounter];
			  for(int i=0;i<s.length;i++)
			  {
				  s[i]=palindromes[i];
			  }
			 
			
	return s;
	}

	public int[] lengthOfPalindrome(String[] exp) {
		int [] n=new int[exp.length];
		for(int i=0;i<n.length;i++)
		{
			n[i]=exp[i].length();
		}
		return n;
	}

	/*public String[] findDesc(String[] palindrome) {
		for(int counter=0;counter<palindrome.length;counter++)
		{
			String temporaryName="";
			
			temporaryName=palindrome[counter];
			int length=temporaryName.length();
			  for (int wordlength = 0; wordlength <length; wordlength++)
			  {
				  
			  }
			 
		}
		return null;*/
}

	


