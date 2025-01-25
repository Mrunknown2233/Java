class NestedTry
{
	public static void main(String args[])
	{
		try
		{
			int a  = 42;
			int b = args.length;

			int div = a/b;
			System.out.println("Going to inner try as div is " + div);
			try
			{
				if(b == 1)
				{
						int c = 12/(b-b);
				}
				else
				{
					int x[] = { 10, 20, 30, 40};
					x[b] = 99;
				}
				System.out.println("Last line of inner try ");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Cannot access index : " + e.getMessage());
			}
				System.out.println("Last line of outer try ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero ! " );
		}
			System.out.println("Exiting main..");
	}
}