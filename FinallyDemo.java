class  FinallyDemo
{
	static int divide(int n1, int n2) throws ArithmeticException
	{
		int res;
		try
		{
			res = n1/n2;
			System.out.println("Returning from divide");
			return res;
		}
		finally
		{
			System.out.println("finally of divide ");
		}
	}
	public static void main(String args[])
	{
		int num1 = 42;
		int num2 = args.length;
		int res;

		try
		{
			res = divide(num1,num2);
			System.out.println("Result  =  "+res);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Caught in main ");
		}
		finally
		{
			System.out.println("Finally of main");
		}
		System.out.println("Exiting main");
	}
}