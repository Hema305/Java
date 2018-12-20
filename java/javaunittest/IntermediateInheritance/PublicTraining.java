package com.cg;
/**
 * 
 * @author Hemalatha Motupalli
 *It's about Training Charges are applied on the basis of training types.
 *
 *Else it is a public program, charges are applied on the basis of, no. of participants (fees * participants).

 */
public class PublicTraining extends Training {
	private int participants;
	

	public PublicTraining(String subject, double fees, int participants) {
		super( subject, fees);
		this.participants= participants;
		
	}
	public int getParticipants() {
		return participants;
	}
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	public double getOrderValue(){
		
		return (getFees() * participants);
	}

}
