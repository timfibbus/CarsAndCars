import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	List<Car> car = new ArrayList<>();
	
	System.out.println("Welcome to the Wonderful World of Cars!");
	
	
	System.out.print("How many cars will you enter? ");
	int numcars = scan.nextInt();
	System.out.println();
	scan.nextLine();
	//String table = "";
	
	for (int i = 0; i < numcars; i++) {
		Car car1 = new Car();
	System.out.print("Enter car #" + (i+1) + " make: ");
	car1.setMake(scan.nextLine());
	System.out.println();
	System.out.print("Enter car #" + (i+1) + " model: ");
	car1.setModel(scan.nextLine());
	System.out.println();
	System.out.print("Enter car #" + (i+1));
	int year = Validate.getPositiveInt(scan, " year: ");
	car1.setYear(year);
	System.out.println();
	System.out.print("Enter car #" + (i+1));
	double price = Validate.getDouble(scan, " price: ");
	car1.setPrice(price);
	System.out.println();
	//scan.nextLine();
	//String first = car1.toString();
	car.add(car1);
	//table = table + car.toString();
	}
	
	System.out.println("Current Inventory: ");
	System.out.println();
	System.out.println("  Make |  Model |Year|  Price  |");
	System.out.println("_______|________|____|_________|");
	for (Car thisCar: car ) {	
		System.out.println(thisCar.toString());
	}

	}
}

