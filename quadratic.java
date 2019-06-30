public class quadratic { 
   public static void main(String[] args) { 
   	  // Ask for value of a
      System.out.print("Enter value of a in ax^2 + bx + c");
      // Parse the string input
      double a = Double.parseDouble(System.console().readLine());
      // add support for asking again if it's not a double
      // Ask for value of b
      System.out.print("Enter value of b in ax^2 + bx + c");
      // Parse the string input
      double b = Double.parseDouble(System.console().readLine());
      // Ask for value of c
      System.out.print("Enter value of c in ax^2 + bx + c");
      // Parse the string input
      double c = Double.parseDouble(System.console().readLine());

      int number_solutions = 0;
      // Calculate the discriminant
      double discriminant = (b*b) - (4 * a * c);
      if (discriminant < 0) {
				System.out.print("There are no solutions to this equation.");
				System.exit(1);
      } else if (discriminant == 0) {
				System.out.print("There is one solution to this equation.");
				number_solutions = 1;
      } else { // discriminant must be greater than 0
				System.out.print("There are two solutions to this equation.");
				number_solutions = 2;
      }
      // Calculate the square root of the discriminant
      double sqrt_discriminant = Math.sqrt(discriminant);

      System.out.print("The solution(s) to the quadratic equation " + a + "x^2 + " + b + "x + " + c + " is...");
      // Because the quadratic formula has a +- sign, we will need to do two operations.
      // Plus
      if (number_solutions == 1) {
      	System.out.print(( -b + sqrt_discriminant) / (2 * a));
    	} else
				System.out.print(( -b + sqrt_discriminant) / (2 * a));
				System.out.print(( -b - sqrt_discriminant) / (2 * a));
			}
   }
