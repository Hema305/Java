
public class TimeForAnObject {
	int hours;
	int minutes;

	public TimeForAnObject(int i, int j) {
		if((i>=0 && i<=24) && (j>=0 && j<=60))
		{
		this.hours=i;
		this.minutes=j;
		}
	
	}

	public static String displayTime(TimeForAnObject number) {
		String timeForNumber=number.hours+" hours "+number.minutes+" minutes";
		return timeForNumber;
	}

	public static String displaySumOfTime(TimeForAnObject timeOne, TimeForAnObject timeTwo) {
		 int hoursSum=timeOne.hours+timeTwo.hours;
		 int minuteSum=timeOne.minutes+timeTwo.minutes;
		 String totalSum=hoursSum+" hours "+minuteSum+" minutes";
		return totalSum;
		 
				 
		
			}

}
