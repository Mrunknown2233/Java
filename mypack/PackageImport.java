package mypack;

public class PackageImport
{
	private String msg;
	private int num;

	public PackageImport()
	{
		System.out.println("Default constructor of PackageImport");
		this.msg = "Hello world";
		num = -1;

	}
	public  PackageImport(String msg, int num)
	{
		System.out.println("Param constructor of PackageImport!");
		this.msg = msg;
		this.num = num;
	}

	public  String toString()
	{
		return "PackageImport[" + this.msg +"," + this.num+"]";
	}
}