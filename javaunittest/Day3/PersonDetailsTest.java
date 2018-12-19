import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonDetailsTest {
	private PersonDetails personOneDetails,personTwoDetails;
	@Test
	public void personOneDetailstest() {
		personOneDetails=new PersonDetails("Hema", 9, 6, 1997);
		//personTwoDetails=new PersonDetails("Kalyan", 6, 6, 1991);
		
		String detailsOfpersonOne=personOneDetails.personDetailsDisplay();
		assertEquals("Hema dob is 9/6/1997",detailsOfpersonOne);	
	}
	@Test
	public void personOneDetailsInDetailtest() {
		personOneDetails=new PersonDetails("Hema", 9, 6, 1997);
		personTwoDetails=new PersonDetails("Kalyan", 6, 6, 1991);
		
		String detailsOfpersonOneInDetail=personOneDetails.personDetailsInDetailDisplay(personOneDetails,personTwoDetails);
		assertEquals("21 years, 6 months, and 10 days.",detailsOfpersonOneInDetail);	
	}
	@Test
	public void personTwoDetailstest() {
		personOneDetails=new PersonDetails("Hema", 9, 6, 1997);
		personTwoDetails=new PersonDetails("Kalyan", 6, 6, 1991);
		
		String detailsOfpersonTwo=personTwoDetails.personDetailsDisplay();
		assertEquals("Kalyan dob is 6/6/1991",detailsOfpersonTwo);	
	}
	@Test
	public void personTwoDetailsInDetailtest() {
		//personOneDetails=new PersonDetails("Hema", 9, 6, 1997);
		personTwoDetails=new PersonDetails("Kalyan", 6, 6, 1991);
		
		String detailsOfpersonTwoInDetail=personTwoDetails.personTwoDetailsInDetailDisplay(personOneDetails,personTwoDetails);
		assertEquals("27 years, 6 months, and 13 days.",detailsOfpersonTwoInDetail);	
	}
	@Test
	public void olderOnetest() {
		personOneDetails=new PersonDetails("Hema", 9, 6, 1997);
		personTwoDetails=new PersonDetails("Latha", 19, 12, 2018);
		
		String detailsOfOlderPerson=personTwoDetails.olderPersonDetailsDisplay(personOneDetails,personTwoDetails);
		assertEquals("Hema is older than  Latha by 21 years, 6 months, and 10 days old.",detailsOfOlderPerson);	
	}
	@Test
	public void olderOnetestAgain() {
		personOneDetails=new PersonDetails("Shyam", 2, 3, 1987);
		personTwoDetails=new PersonDetails("Ram", 5, 6, 1980);
		
		String detailsOfOlderPersonagain=personTwoDetails.olderPersonDetailsDisplay(personOneDetails,personTwoDetails);
		assertEquals("Ram is older than  Shyam by 6 years, 8 months, and 25 days old.",detailsOfOlderPersonagain);	
	}

}
