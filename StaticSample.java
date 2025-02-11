class Sample
{
	static int a = 3;
	static int b;

	static 
	{
		System.out.println("Static Initializer Block of Sample");
		b = a * 4;
	}

	static void set(int x)
	{
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	{
		System.out.println("Will I be called ? ");
	}
}

class StaticSample
{
	{
		System.out.println("Hello  Wolrd ");
	}

	public static void main(String args[])
	{
		System.out.println("Inside Main");

		Sample s1  = new Sample();
		Sample s2  = new Sample();
		Sample s3  = new Sample();

		Sample.set(100);

		s1.a  =  42;
		s2.b = 76;
		s3.set(11);

		Sample.set(40);

		Sample.a = 1000;
		s2.b = s1.a * 2;
		s3.set(12);
	}

	static
	{
		System.out.println("Static block of Static Sample ");
	}
}