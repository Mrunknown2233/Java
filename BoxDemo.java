class Box
{
	private double width,height,depth;

	void set (double w,double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}	
	double volume()
	{
		return width * height *depth;
	}
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		Box b2 = new Box();

		b1.set(1,2,3);
		b2.set(10,20,30);

		double vol;
		vol = b1.volume();

		System.out.println("Volume for b1  = " + vol);
		System.out.println("Volume for b2  = " +b2.volume() );
	}
}
