public class PotterBookCalc2 {
	// Put it into a method
	public static String getBookName(int bookNumber) {
		String bookTitle;
		switch(bookNumber) {
			case 1: bookTitle = "Philosopher's Stone";
					break;
			case 2: bookTitle = "Chamber of Secrets";
					break;
			case 3: bookTitle = "Prisoner of Azkaban";
					break;
			case 4: bookTitle = "Goblet of Fire";
					break;
			case 5: bookTitle = "Order of the Phoenix";
					break;
			case 6: bookTitle = "Half-blood Prince";
					break;
			case 7: bookTitle = "Deathly Hallows";
					break;
			default: bookTitle = "Nonexistent Book. Try again.";
					break;
		}
		return bookTitle;
	}
	public static void main(String[] args) {
		System.out.println("Book number:");
		int bookNumber = Integer.parseInt(System.console().readLine());
		System.out.println("Harry Potter and the " + getBookName(bookNumber));
	}
}