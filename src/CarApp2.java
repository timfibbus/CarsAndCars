import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Car> cars = new ArrayList<>();

		Car newcar1 = new Car("Toyota", "Prius", 2019, 23000);
		Car newcar2 = new Car("Tesla", "Model Y", 2021, 36000);
		Car newcar3 = new Car("Ford", "Fusion", 2020, 18004);
		Car used1 = new UsedCar("Subaru", "WRX", 1995, 5942.30, 139003);
		Car used2 = new UsedCar("Honda", "Civic", 1991, 4000.15, 150034);
		Car used3 = new UsedCar("Mazda", "RX-7", 1987, 5000.50, 89040);
		Car quit = new QuitCar("Quit");
		
		cars.add(newcar1);
		cars.add(newcar2);
		cars.add(newcar3);
		cars.add(used1);
		cars.add(used2);
		cars.add(used3);
		cars.add(quit);
		
		int x = -1;
		double sum = 0;
		
		boolean letsParty = true;
		while (letsParty) {
		
			try {
				sum = sum + cars.get(x-1).price;
				cars.remove(x-1);
			} catch (Exception e) {
			} finally {
				System.out.println("_________________________________________");
				System.out.println("   Make |  Model |Year|  Price  | Mileage");
				System.out.println("________|________|____|_________|________");
				for (int i = 0; i < cars.size(); i++) {
					System.out.println((i + 1) + cars.get(i).toString());
				}
				
				System.out.println();
				x = Validate.getPositiveInt(scan, "Select the number of the car you're interested in: ");
				while (x < 1 || x > cars.size()) {
					System.out.println("Please enter a number from the list.");
					System.out.println();
					x = Validate.getPositiveInt(scan, "Select the number of the car you're interested in: ");
				}
				System.out.println();
				
				if (cars.get(x-1) == quit) {
					break;
				}
				
				System.out.println(cars.get(x-1));
				System.out.println();
				
				System.out.println("Would you like to buy this car?  (y/n)");
				System.out.println();
				letsParty = Validate.iDo(scan.nextLine());
				
			}
		}
		
		if (sum > 0) {
			System.out.printf("Your total today is: $%.2f", sum);
			System.out.println();
		}
		System.out.println("Goodbye!");
	}

}
