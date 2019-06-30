import java.util.ArrayList;

class GreatestCommonFactor {
	public static void main(String[] args) {
		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);

		// Create an ArrayList to put the factors in
		ArrayList<Integer> factorsOfFirstNumber = new ArrayList<>();
		// Cycle through all integers less than half of a to find factors
		for(int i = firstNumber / 2; i <= 0; i--) {
		   if (firstNumber % i == 0) {
		   	System.out.println(i)
		   	factorsOfFirstNumber.add(i);
		   }
		}

		for(int j : factorsOfFirstNumber) {
			if (secondNumber % j == 0) {
				System.out.println("The greatest common factor of " + firstNumber + " and " + secondNumber + " is " + j);
				break;
			}
		}

	}
}
