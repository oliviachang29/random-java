class tempcalc
{
	public static void main(String[] args)
	{
		float t = Float.parseFloat(args[0]);
		System.out.println("celsius: " + ((t - 32) * 5) / 9);
		System.out.println("fahrenheit: " + ((t * 9) / 5) + 32 );
	}
}