import java.io.*;
import java.net.*;


class ServerCode2
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

				new ThreadedServerEchoer(socket);
			}
			
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}