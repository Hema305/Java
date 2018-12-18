import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionStateTest {
	private TelevisionFunctionality  televisionStateCheck;
	@Test
	public void checkTelevisionStateOn() //checks state iS ON
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		boolean stateOfTelevision=TelevisionFunctionality.TelivisionFunctionalityCheck(televisionStateCheck);
		assertEquals(true, stateOfTelevision);
	}
	@Test
	public void checkTelevisionStateOff() //checks state iS OFF
	{
		televisionStateCheck=new TelevisionFunctionality("OFF","Pogo",25);
		boolean stateOfTelevision=TelevisionFunctionality.TelivisionFunctionalityCheck(televisionStateCheck);
		assertEquals(false, stateOfTelevision);
	}
	
	@Test
	public void checkTelevisionCurrentstateInOn() //Checks channel and volume when Tv in ON
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		String stateOfTelevision=TelevisionFunctionality.TelevisionCurrentstateCheck(televisionStateCheck);
		assertEquals("Channel is Pogo and volume is 25", stateOfTelevision);
	}
	@Test
	public void checkTelevisionCurrentstateInOff() ////Checks channel and volume when Tv in OFF and gives message say turn on
	{
		televisionStateCheck=new TelevisionFunctionality("OFF","Pogo",25);
		String stateOfTelevision=TelevisionFunctionality.TelevisionCurrentstateCheck(televisionStateCheck);
		assertEquals("Turn on the TV!!!", stateOfTelevision);
	}
	@Test
	public void checkTelevisionVolumeIncrease() //checks volume Increase
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionVolumeIncrease(televisionStateCheck);
		assertEquals(26, volumeOfTelevision);
	}
	@Test
	public void checkTelevisionVolumeDecrease()//checks volume Decrease
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionVolumeDecrease(televisionStateCheck);
		assertEquals(24, volumeOfTelevision);
	}
	@Test
	public void checkTelevisionInOffVoumeIncrease() //checks volume Increase when it's off
	{
		televisionStateCheck=new TelevisionFunctionality("OFF","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionVolumeIncrease(televisionStateCheck);
		assertEquals(0, volumeOfTelevision);
	}
	@Test
	public void checkTelevisionInOffVolumeDecrease()  //checks volume Decrease when it's off
	{
		televisionStateCheck=new TelevisionFunctionality("OFF","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionVolumeDecrease(televisionStateCheck);
		assertEquals(0, volumeOfTelevision);
	}
	@Test
	public void checkTelevisionChannelchangeUp() //check channel change up
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		String channeOfTelevision=TelevisionFunctionality.TelevisionChannelChangeUp(televisionStateCheck);
		assertEquals("CN", channeOfTelevision);
	}
	@Test
	public void checkTelevisionChannelchangeDown()//check channel change down 
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		String channeOfTelevision=TelevisionFunctionality.TelevisionChannelChangeDown(televisionStateCheck);
		assertEquals("Pogo", channeOfTelevision);
	}
	@Test
	public void checkTelevisionCurrentChannel()//check current channel 
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		String channeOfTelevision=TelevisionFunctionality.TelevisionCurrentChannel(televisionStateCheck);
		assertEquals("Pogo", channeOfTelevision);
	}
	@Test
	public void checkTelevisionCurrentVolume() //checks current volume 
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionCurrentVolume(televisionStateCheck);
		assertEquals(25, volumeOfTelevision);
	}
	@Test
	public void makeTelevisionTurnOn() //makes turn ON When it's OFF
	{
		televisionStateCheck=new TelevisionFunctionality("OFF","Pogo",25);
		String state=TelevisionFunctionality.TelevisionTurnOnOrOff(televisionStateCheck);
		assertEquals("ON",state);
	}
	@Test
	public void makeTelevisionTurnOff() //makes turn OFF when it's ON
	{
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		String state=TelevisionFunctionality.TelevisionTurnOnOrOff(televisionStateCheck);
		assertEquals("OFF",state);
	}
	
}
