
public class UsedCar extends Car{

	protected int mileage = 0;
	
	public UsedCar() {
		super();
	}
	
	public UsedCar(String make, String model, int year, double price, int mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		 String format = String.format("%7s|%8s|%4d|$%8.2f|%7d", make, model, year, price, mileage);
			return format;
	}

	
	
}
