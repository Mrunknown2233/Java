class A
{
	int num;

	void set(int num)
	{
		this.num = num;
	}

	void show()
	{
		System.out.println("A's num = " + this.num);
	}
}


class B extends A
{
	int num;

	void set(int x, int y)
	{
		this.num = y;
		super.set(x);
	}

	void show()
	{
		System.out.println("B's num = " + this.num);
		super.show();
	}
}


class MethodOverriding
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.set(10,20);
		obj.show();
	}
}