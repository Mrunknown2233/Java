package mypack;

//package pack1[.pack2[.pack3]]

public class PackageSample 
{
    public void display()
    {
        System.out.println("Display of PackageSample class");
    }
    public static void main(String args[]) 
	{
        System.out.println("Inside Main of PackageSample");
        new PackageSample().display();
    }
}
