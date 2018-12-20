package com.cg;
/**
 * 
 * @author Hemalatha Motupalli
 *It's about Training Charges are applied on the basis of training types.
 *If it’s a corporate company, charges are applied on the basis of per day(fees * days). 
 *Else it is a public program, charges are applied on the basis of, no. of participants (fees * participants).

 */

public abstract class Training {
	private int id;
	private String subject;
	private double fees;
	private static int idGenerator;
	static{
		idGenerator=101;
	}
	{
		id = ++idGenerator;
	}
	public Training( String subject, double fees) {
		super();
		this.subject = subject;
		this.fees = fees;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}

	public abstract double getOrderValue();
		

	
}


