
public class NewPriceTestCheck {

	public double discountFind(double newItem, double discountPercentage) {
		double discountAmount=((discountPercentage*newItem)/100);
		return discountAmount;
	}

	public double newPriceFound(double newItem, double discountPercentage) {
		double newPricetAmount=newItem-((discountPercentage*newItem)/100);
		return newPricetAmount;
	}


}
