import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionStateTest {
	private TelevisionFunctionality  televisionStateCheck;
	@Test
	public void checkTelevisionState() {
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		boolean stateOfTelevision=TelevisionFunctionality.TelivisionFunctionalityCheck(televisionStateCheck);
		assertEquals(true, stateOfTelevision);
	}
	@Test
	public void checkTelevisionCurrentstateInOn() {
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		String stateOfTelevision=TelevisionFunctionality.TelevisionCurrentstateCheck(televisionStateCheck);
		assertEquals("Channel is Pogo and volume is 25", stateOfTelevision);
	}
	@Test
	public void checkTelevisionCurrentstateInOff() {
		televisionStateCheck=new TelevisionFunctionality("OFF","Pogo",25);
		String stateOfTelevision=TelevisionFunctionality.TelevisionCurrentstateCheck(televisionStateCheck);
		assertEquals("Turn on the TV!!!", stateOfTelevision);
	}
	@Test
	public void checkTelevisionVolumeIncrease() {
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionVolumeIncrease(televisionStateCheck);
		assertEquals(26, volumeOfTelevision);
	}
	@Test
	public void checkTelevisionVolumeDecrease() {
		televisionStateCheck=new TelevisionFunctionality("ON","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionVolumeDecrease(televisionStateCheck);
		assertEquals(24, volumeOfTelevision);
	}
	@Test
	public void checkTelevisionInOffVoumeIncrease() {
		televisionStateCheck=new TelevisionFunctionality("OFF","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionVolumeIncrease(televisionStateCheck);
		assertEquals(0, volumeOfTelevision);
	}
	@Test
	public void checkTelevisionInOffVolumeDecrease() {
		televisionStateCheck=new TelevisionFunctionality("OFF","Pogo",25);
		int volumeOfTelevision=TelevisionFunctionality.TelevisionVolumeDecrease(televisionStateCheck);
		assertEquals(0, volumeOfTelevision);
	}
}
