
public class TelevisionFunctionality {
	String state="";
	static int volume=0;
	String channel;
	static String currentChannelAndVolume="";
	public TelevisionFunctionality(String string, String string2, int i)//constructor for state
	{
		// TODO Auto-generated constructor stub
		this.state=string;
		this.channel=string2;
		this.volume=i;
	}
	public static boolean TelivisionFunctionalityCheck(
			TelevisionFunctionality televisionStateCheck) {
		 	if(televisionStateCheck.state=="ON")
		 		return true;
		 	else
		 		return false;
	}
	public static String TelevisionCurrentstateCheck(
			TelevisionFunctionality televisionStateCheck)
	{
			if(televisionStateCheck.state=="ON")
			{
				currentChannelAndVolume="Channel is "+televisionStateCheck.channel+" and volume is "+televisionStateCheck.volume ;
			}
			else
			{
				
				currentChannelAndVolume="Turn on the TV!!!";
			}
			return currentChannelAndVolume;
	}
	public static int TelevisionVolumeIncrease(
			TelevisionFunctionality televisionStateCheck) {
		if(televisionStateCheck.state=="ON")
		{
		
			volume=++(televisionStateCheck.volume);
		}
		else
		{
			volume=0;
		}
		
		return volume;
	}
	public static int TelevisionVolumeDecrease(
			TelevisionFunctionality televisionStateCheck) {
		
		if(televisionStateCheck.state=="ON")
		{
		
			volume=--(televisionStateCheck.volume);
		}
		else
		{
			volume=0;
		}
		
		return volume;
	}
	
}
	
	

	


