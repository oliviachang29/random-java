class factor {
	public static void main(String[] args) {
		System.out.println("Calculate the factors of (integer only): ");
		float startTime = System.nanoTime();
		int a = Integer.parseInt(System.console().readLine());
		System.out.println("Factors:");
		for(int i = 1; i <= a / 2; i++)
		{
		   if (a % i == 0) {
		   	System.out.println(i);
		   }
		}
		float endTime = System.nanoTime();
		double duration = (endTime - startTime) / 1000000000;
		System.out.println("Calculation done in " + duration + " seconds."); 
	}
}

