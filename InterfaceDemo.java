interface A
{
	void method1();
	void method2();
}

interface B
{
	void method3();
}

class Sample implements A,B
{
	public void method1()
	{
		System.out.println("method1 of Sample");
	}

	public void method2()
	{
		System.out.println("method2 of Sample");
	}

	public void method3()
	{
		System.out.println("method3 of Sample");
	}

	void myOwnMethod()
	{
		System.out.println("myOwnMethod of sample");
	}
}

public class InterfaceDemo
{
	public static void main(String args[])
	{
		Sample s = new Sample();

		A a;
		B b;

		s.method1();
		s.method2();
		s.method3();
		s.myOwnMethod();

		a = s;
		a.method1();
		a.method2();
		//a.method3();
		//a.myOwnMethod();

		b = s;
		//b.method1();
		//b.method2();
		b.method3();
		//b.myOwnMethod();
	}
}
