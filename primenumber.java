import java.util.*;


public class primenumber {
	public static void main(String[] args){
		
		System.out.println("Enter a number: ");
		//code
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		scanner.close();

		//maths
		int potentialFactor = 2;
		while (userInput % potentialFactor != 0) {
			potentialFactor ++;
		}
		if (potentialFactor == userInput) {
			System.out.println("The number is prime.");
		}
		else {
			System.out.println("The number isn't prime.");
		}
	}
}
