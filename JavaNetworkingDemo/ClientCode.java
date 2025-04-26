import java.io.*;
import java.net.*;


class ClientCode
{
	public static void main(String[] args) 
	{
		try
		{
			Socket socket = new Socket("127.0.0.1",5555);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String line = null;

			while(!(line = br.readLine()).equalsIgnoreCase("exit"))
			{
				out.println(line);
				String serverData = in.readLine();
				System.out.println(("Got : " + serverData));
			}

			out.println("Exit"); //if this line is commented the server will throw an null point exception for now.
			System.out.println("Exiting socket ....");
			in.close();
			out.close();
			socket.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}