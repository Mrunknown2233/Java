class A
{
	private int a,b;

	void set(int a,  int b)
	{
		this.a = a;
		this.b = b;
	}

	void display()
	{
		System.out.println("a  =  " + a);
		System.out.println("b  =  " + b);
	}
}

class B extends A
{
	private int c;

	void set(int a , int b, int c)
	{
		set(a,b);
		this.c = c;
	}

	void show()
	{
		display();
		System.out.println("c = " + c);
	}
}



class InheritancePrivate
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.set(10,20,30);
		obj.show();
	}
}