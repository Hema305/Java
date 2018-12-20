public class Palindrome {

	public boolean findPalindrome(int i)
	{
		if(i>10)
		{
			int temp=i, remainder,sum=0;
			while(i!=0)
			{
				remainder=i%10;
				sum=(sum*10)+remainder;
				i=i/10;
			
			}
			 return (sum==temp);
		}
		
		else 
			return false;
		
		
	}


}


