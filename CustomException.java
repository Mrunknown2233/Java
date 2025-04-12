import java.io.*;
class NegativeAgeException extends Exception
{
    NegativeAgeException(String msg)
    {
        super(msg);
    }
}
class CustomException 
{
    public static void main(String args[]) 
	{
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name");
            String name = br.readLine();

            System.out.println("Enter your age : ");
            int age = Integer.parseInt(br.readLine());

            if(age<0)
                throw   new NegativeAgeException("cannot have -ve age" + age);
            System.out.println("Your Name: " + name);
            System.out.println("Your Age:  " + age);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(NegativeAgeException e)
        {
            System.out.println(e);
        }
    }
}
