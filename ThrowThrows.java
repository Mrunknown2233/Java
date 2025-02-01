class ThrowThrows
{
	static int divide(int num1, int num2) throws ArithmeticException
	{
		int res;

		try 
		{
			res = num1/num2;
			System.out.println("Result = "+res);
			return res;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught in divide ");
			throw e;
		}
	}
	public static void main(String args[])
	{
		int num1,num2,res;

		num1 = 2411;
		num2 = args.length;

		try 
		{
			res = divide(num1,num2);
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught in main");
		}

		System.out.println("Exiting main ....");
	}
}