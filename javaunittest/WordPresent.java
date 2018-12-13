
public class WordPresent {

	public int CheckPresence(String[] names, String string) {
	int nameCount=0;
	for(int counter=0;counter<names.length;counter++)
	{
		if(names[counter].equals(string))
		{
			nameCount++;
		}
	}
		return nameCount;
	}

}
