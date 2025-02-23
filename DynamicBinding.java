class A
{
	int a = 100;

	void show()
	{
		System.out.println("a = " + a);
	}
}

class B extends A
{
	int b = 200;

	void show()
	{
		System.out.println("b = " + b);
	}
}

class C extends B
{
	int c = 300;
	
	void show()
	{
		System.out.println("c = " + c);
	}

	void myOwnMethod()
	{
		System.out.println("My own method of c ");
	}
}

class DynamicBinding
{
	public static void main(String args[])
	{
		A ref;

		//A objA = new A();
		//B objB = new B();
		//C objC = new C();
		
		//ref = objA;


		ref = new A();
		ref.show();

		//ref - objB;
		ref = new B();
		ref.show();

		//ref = objC;
		ref = new C();
		ref.show();
		//ref.myOwnMethod();  ->This will give error as myOwnMethod is not a part of class A
	}
}
