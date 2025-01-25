class ExceptionHandling
{
	public static void main(String args[])
	{
		int num1 = 10;
		int num2 = args.length;
		int res;

		try
		{
			res = num1/num2;	
		System.out.println("Result  =  "  + res);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Cannot divide by 0 ");
		}
		
		System.out.println("Bye Bye ");
	}
}