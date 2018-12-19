import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class PersonDetails {
	
	private String name; // data member to store the name of a person.
	private Date dob; // data member to store the date of birth of a person.
	int date,month,year;
	public PersonDetails(String string, int i, int j, int k) {
		this.name=string;
		this.date=i;
		this.month=j;
		this.year=k;
	}
	public String personDetailsDisplay() {
		
		return name+" dob is "+date+"/"+month+"/"+year;
	}
	
	public String olderPersonDetailsDisplay(PersonDetails personOneDetails, PersonDetails personTwoDetails) {
		String olderPersonData="";
		LocalDate personOneDob = LocalDate.of(personOneDetails.year, personOneDetails.month, personOneDetails.date);
		System.out.println(personOneDob );
		LocalDate personTwoDob = LocalDate.of(personTwoDetails.year, personTwoDetails.month, personTwoDetails.date);
		
		if(personOneDetails.year>personTwoDetails.year )
		{
			Period p = Period.between(personTwoDob, personOneDob);
			//long p2 = ChronoUnit.DAYS.between(personTwoDob, personOneDob);
			olderPersonData=("Ram is older than  Shyam by " + p.getYears() + " years, " + p.getMonths() +
			                   " months, and " + p.getDays() +
			                   " days old.");
		}
		else
		{
			Period p = Period.between(personOneDob, personTwoDob);
			long p2 = ChronoUnit.DAYS.between(personOneDob, personTwoDob);
			olderPersonData=("Hema is older than  Latha by " + p.getYears() + " years, " + p.getMonths() +
			                   " months, and " + p.getDays() +
			                   " days old.");
		}
	
		 return olderPersonData;
	}
	
	public String personDetailsInDetailDisplay(PersonDetails personOneDetails,
			PersonDetails personTwoDetails) {
		String age="";
		
		LocalDate personOneDob = LocalDate.of(personOneDetails.year, personOneDetails.month, personOneDetails.date);
		LocalDate today = LocalDate.now();
			Period p = Period.between(personOneDob, today);
			//long p2 = ChronoUnit.DAYS.between(personTwoDob, personOneDob);
			age=( p.getYears() + " years, " + p.getMonths() +
			                   " months, and " + p.getDays() +" days.");
		
	
		return age;
	
	
	}
	
	public String personTwoDetailsInDetailDisplay(
			PersonDetails personOneDetails, PersonDetails personTwoDetails) {
String age1="";
		
		LocalDate personTwoDob = LocalDate.of(personTwoDetails.year, personTwoDetails.month, personTwoDetails.date);
		LocalDate today = LocalDate.now();
			Period p1 = Period.between(personTwoDob, today);
			//long p2 = ChronoUnit.DAYS.between(personTwoDob, personOneDob);
			age1=( p1.getYears() + " years, " + p1.getMonths() +
			                   " months, and " + p1.getDays() +" days.");
		
	
		return age1;
	}
}
