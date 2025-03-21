import mypack.*;

class ImportMain 
{
    public static void main(String args[]) 
	{
        PackageImport p1 = new PackageImport();        
        PackageImport p2 = new PackageImport("Soumya",2411);
        System.out.println(p1);
        System.out.println(p2);
    }
}
