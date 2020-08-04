public class Car {

	protected String make;
	
	protected String model;
		
	protected int year;
	
	protected double price;
		
	public Car() {
		
	}
	
	public Car(String make) {
		this.make=make;
	}
	
	public Car(String make, String model, int year, double price) {
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
		
		String format = String.format("%7s|%8s|%4d|$%8.2f| ", make, model, year, price);
		return format;
	}
	
	
}
