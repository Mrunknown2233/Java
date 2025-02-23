abstract class Shape
{
	private int side1,side2;

	Shape(int side1,int side2)
	{
		this.side1 = side1;
		this.side2 = side2;
	}

	abstract void area();
	abstract void perimeter();


	void display()
	{
		System.out.println("Side1 = " + this.side1);
		System.out.println("Side2 = " + this.side2);
	}


	//getter
	public int getSide1(){return this.side1;}
	public int getSide2(){return this.side2;}


	//setter
	public void setSide1(int side1){this.side1 = side1;}
	public void setSide2(int side2){this.side2 = side2;}
}

class Rectanlge extends Shape
{
	Rectangle(int side1,int side2)
	{
		super(side1,side2);
	}

	void area()
	{
		int area = getSide1() * getSide2();
		System.out.println("Area of rectangle = "  + area ");
	}

	void perimeter()
	{
		int peri = 2 * (getSide1() + getSide2());
		System.out.println("Perimeter of rectangle  = " + peri);
	}
}

class Square extends Shape
{
	Square(int side)
	{
		super(side,side);
	}

	void area()
	{
		int area = getSide1() * getSide2();
		System.out.println("Area of square = " + area);
	}

	void perimeter()
	{
		int peri = 4 * getSide1();
		System.out.println("Perimeter of square = " + peri);
	}
}


class ShapeDemo
{
	public static void main()
	{
		Shape s;

		s = new Rectangle(10,20);
		s.area();
		s.perimeter();

		s = new Square(10);
		s.area();
		s.perimeter();
	}
}




