
public class Main {

	public static void main(String[] args) {
		
		//Each of the actions below are separate equations
		Calculator.add(10, 20.5);
		Calculator.subtract(10, 20.5);
		Calculator.multiply(10, 20.5);
		Calculator.divide(10, 20.5);
		
		//Displays all results from previous Calculator calculations
		Calculator.results.forEach(System.out::println);

	}

}
