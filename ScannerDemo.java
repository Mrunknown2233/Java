import java.util.Scanner;

class ScannerDemo 
{
    public static void main(String args[]) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name :");    
        String name = scanner.nextLine();

        System.out.println("Enter your roll no : ");
        int rollNo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your branch");
        String branch =  scanner.nextLine();

        System.out.println("Enter your percentage: ");
        float perc = scanner.nextFloat();

        System.out.println("Name : "  + name);
        System.out.println("rollNo  : "  + rollNo);
        System.out.println("Branch : "  + branch);
        System.out.println("Percentage : "  + perc);
    }
}
