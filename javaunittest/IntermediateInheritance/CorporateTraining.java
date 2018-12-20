package com.cg;
/**
 * 
 * @author Hemalatha Motupalli
 *It's about Training Charges are applied on the basis of training types.
 *If it’s a corporate company, charges are applied on the basis of per day(fees * days). 

 */
public class CorporateTraining extends Training {
	private int days;

	public CorporateTraining(String subject, double fees,int days) {
		super(subject, fees);
		this.days=days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	public double getOrderValue(){
		return (getFees() * days);
	}
	
	
}
