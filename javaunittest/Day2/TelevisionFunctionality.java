
public class TelevisionFunctionality {
	private static String state="";
	private static int volume=0;
	private static String channels[]={"Pogo","CN","TV9","STAR MAA"};
	private static String channel="";
	private static String currentChannelAndVolume="";
	private static int count=0;
	public TelevisionFunctionality(String string, String string2, int i)//constructor for state
	{
		// TODO Auto-generated constructor stub
		this.state=string;
		for(int i1=0;i1<channels.length;i1++)
		{
			this.channel=string2;
		}
	
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
	public static String TelevisionChannelChangeUp(
			TelevisionFunctionality televisionStateCheck) {
		if(televisionStateCheck.state=="ON")
		{
		
		
				channel=channels[++count];
			
		}
		
		return channel;
	}
	public static String TelevisionChannelChangeDown(
			TelevisionFunctionality televisionStateCheck) {
		if(televisionStateCheck.state=="ON")
		{
		
		
				channel=channels[--count];
			
		}
		
		return channel;
	}
	public static String TelevisionCurrentChannel(
			TelevisionFunctionality televisionStateCheck) {
		
		if(televisionStateCheck.state=="ON")
		{
		
		
				channel=channels[count];
			
		}
		
		return channel;
	}
	public static int TelevisionCurrentVolume(
			TelevisionFunctionality televisionStateCheck) {
		if(televisionStateCheck.state=="ON")
		{
		
			volume=televisionStateCheck.volume;
		}
		else
		{
			volume=0;
		}
		
		return volume;
	}
	public static String TelevisionTurnOnOrOff(
			TelevisionFunctionality televisionStateCheck) {
		if(state=="OFF")
			state="ON";
		else
			state="OFF";
		return state;
	}
	
}
	
	

	


