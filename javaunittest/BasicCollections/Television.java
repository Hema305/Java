
public class Television {

	String company="";
	String type="";
	boolean threeDimensionalEnabled=false;
	double price=0.0;
	public Television(String company, String type, boolean threeDimensionalEnabled,
			double price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDimensionalEnabled = threeDimensionalEnabled;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (threeDimensionalEnabled ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
//		if (threeDimensionalEnabled != other.threeDimensionalEnabled)
//			return false;
//		if (type == null) {
//			if (other.type != null)
//				return false;
//		}
		else if (!type.equals(other.type))
			return false;
		return true;
	}

	public boolean isThreeDimensionalEnabled() {
		return threeDimensionalEnabled;
	}
	
	public void setThreeDimensionalEnabled(boolean threeDimensionalEnabled) {
		this.threeDimensionalEnabled = threeDimensionalEnabled;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type
				+ ", threeDimensionalEnabled=" + threeDimensionalEnabled
				+ ", price=" + price + "]";
	}
	
}
