import java.util.ArrayList;
import java.util.List;

public class CarList extends UsedCar{

	
	private int carNum;
	
	private Car car;
	
	private ArrayList<Car> theCars = new ArrayList<>();
	
	public CarList() {
		
	}
	public CarList (List<Car> cars) {
	}
	
	public CarList (List<Cars> cars, String used) {
		
	}
	public ArrayList<Car> getTheCars() {
		return theCars;
	}
	public void setTheCars(ArrayList<Car> theCars) {
		this.theCars = theCars;
	}
	/*
	public CarList(int carNum, Car car, ArrayList<Car> theCars) {
		super();
		this.carNum = carNum;
		this.car = car;
		this.theCars = theCars;
	}
	public CarList(int carNum, Car car) {
		super();
		this.carNum = carNum;
		this.car = car;
	}
	*/	
	public void removeTheCar(ArrayList<Car> theCars, int index) {
		theCars.remove(index);
		this.theCars=theCars;
	}

	
	/*public String getString(ArrayList<Car> theCars, int index) {
		if (this.car instanceof UsedCar) {
		String format = String.format("%7s|%8s|%6d|$%8.2f|%6d", make, model, year, price, mileage);
		} else {String format = String.format("%7s|%8s|%6d|$%8.2f|%6d", make, model, year, price, mileage);
		return format;
		}
	
	}*/
	
	
	@Override
	public String toString() {
		String format = String.format("%7s|%8s|%6d|$%8.2f|%6d", make, model, year, price, mileage);
		return format;
	}
	
	
	
	
}
