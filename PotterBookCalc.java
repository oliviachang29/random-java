public class PotterBookCalc {
	public static void main(String[] args) {
		System.out.println("Book number:");
		int book_num = Integer.parseInt(System.console().readLine());
		String bookTitle;
		switch(book_num) {
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
		System.out.println("Harry Potter and the " + bookTitle);
	}
}