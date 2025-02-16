class Box
{
	double width,height,depth;

	Box()
	{
		width = height  = depth = -1;
	}

	Box(double len)
	{
		width = height = depth = len;
	}

	Box(double width, double height, double depth)
	{
		this.width= width;
		this.height = height;
		this.depth = depth;
	}

	Box(Box ob)
	{
		//clone constructor
		this.width = ob.width;
		this.height = ob.height;
		this.depth = ob.depth;
	}

	void display()
	{
		System.out.println("====Box Details ====");
		System.out.println("Width = " + width);
		System.out.println("Heigth  = " +height );
		System.out.println(" Depth = " + depth);
	}

	double volume()
	{return width*height*depth;}
}

class BoxWeight extends Box
{
	double weight;

	BoxWeight(double width,double height, double depth, double weight)
	{
		/* 
			this.width = width;
			this.height = height;
			this.depth = depth;
		*/
		super(width,height,depth);
		this.weight = weight;
	}
}

class MyBox
{
	public static void main(String args[])
	{
		Box b1 = new Box(1,2,3);
		Box b2 = new Box(b1);

		BoxWeight bw = new BoxWeight(10,20,30,40);

		double volume = b1.volume();
		System.out.println("Volume of b1 = " + volume);
		System.out.println("Volume of b2 = " + b2.volume());

		System.out.println("Volume of bw = " + bw.volume());
		System.out.println("Weight of bw = " + bw.weight);
	}
}