class A
{
	int a,b;

	void display()
	{
		System.out.println("a =  " + a);
		System.out.println("b =  " + b);
	}
}

class B extends A
{
	int c;

	void show()
	{
		display();
		System.out.println("c  = " + c);
	}
}


class InheritanceSample
{
	public static void main(String args[])
	{
		B obj = new B();

		obj.a = 24;
		obj.b = 11;
		obj.c = 2411;

		obj.show();
	}
}