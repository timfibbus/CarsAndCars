
public class QuitCar extends Car{

	public QuitCar () {
		
	}
	
	public QuitCar(String make) {
		this.make=make;
	}
	@Override
	public String toString() {
		return "  "+make;
	}
}
