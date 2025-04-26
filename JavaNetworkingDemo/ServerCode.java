import java.io.*;
import java.net.*;


class ServerCode
{
	public static void main(String[] args) 
	{
		try
		{
			ServerSocket serverSocket = new ServerSocket(5555);

			while(true)
			{
				System.out.println("Server waiting for client to connect...");
				Socket socket = serverSocket.accept();
				System.out.println("Server connected with a client ....");


				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

				String line = null;

				while(!(line = in.readLine()).equalsIgnoreCase("exit"))
				{
					System.out.println("Server received : " + line);
					out.println("Echo '" + line + "'");
				}
				System.out.println("Client exited...");
				in.close();
				out.close();
				socket.close();
			}
			
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}