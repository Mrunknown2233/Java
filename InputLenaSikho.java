import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputLenaSikhlo
{
    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Enter your name :");
            String name = br.readLine();

            System.out.print("Enter your Data Structure marks :");
            float marks = Float.parseFloat(br.readLine());

            System.out.println("Welcome " + name);
            System.out.println("Congratulations for scoring " + marks  + "in DS");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }    
    }
}