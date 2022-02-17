package oops;

abstract class Shape
{
	abstract void draw();
}
class Circle extends Shape
{
	Circle()
	{
		System.out.println("Circle class constructor is called ");
	}
	void draw()
	{
		System.out.println("Circle is drawn ");
	}
}
class Square extends Shape
{
	Square()
	{
		System.out.println("Square class constructor is called ");
	}
	void draw()
	{
		System.out.println("Square is drawn ");
	}
}
class Rectangle extends Shape
{
	Rectangle()
	{
		System.out.println("Rectangle class constructor is called ");
	}
	void draw()
	{
		System.out.println("Rectangle is drawn ");
	}
}
public class Shape_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle();
		Square s=new Square();
		Rectangle r=new Rectangle();
		c.draw();
		s.draw();
		r.draw();
	}

}
