import java.io.*;
import java.net.*;

class ThreadedServerEchoer extends Thread
{
	Socket socket;
	ThreadedServerEchoer( Socket socket)
	{
		this.socket = socket;
		start();
	}	

	public void run()
	{
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

			String line = null;

			 while (!(line = in.readLine()).equalsIgnoreCase("exit")) {    
                System.out.println("Server received: " + line);
                out.println("Echo '" + line + "'");
            }
			System.out.println("Client exited...");
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