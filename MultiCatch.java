class MultiCatch
{
	public static void main( String args[])
	{
		
		try
		{
			int a = 42;
			int b = args.length;
			int div =  a/b;

			System.out.println("Divsion  = "  + div);

			int x[] = { 10, 20, 30, 40};
			x[b] = 99;
			System.out.println("Last line of try block ");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Cannot divide by zero " + ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Some index which is not accessible is accessed " + e.getMessage());
		}
		System.out.println("Exiting Main ");
	}
}