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
}




