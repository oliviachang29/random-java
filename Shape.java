interface Shape
{
	void draw();
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("I am a circle.");
	}
}

class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("I am a rectangle.");
	}
}

Shape shape = new Circle();
shape.draw(); // Expected output: I am a circle.
shape = new Rectangle();
shape.draw(); // Expected output: I am a rectangle.