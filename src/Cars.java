
public class Cars {

	protected String make = "unknown";
	
	protected String model = "mystery";
		
	protected int year = 1911;
	
	protected double price = 420.00;
		
	public Cars() {
		
	}
	
	public Cars(String make, String model, int year, double price) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.price=price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Here we have a "+ year +" " +make+ " "+model+ ".  It costs "+ price;
	}
	
	
}
