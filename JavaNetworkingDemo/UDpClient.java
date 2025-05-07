import java.io.*;
import java.net.*;

class UDPClient
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket socket = new DatagramSocket();
		InetAddress address = InetAddress.getLocalHost();

		BufferedReader consoleBr = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while(!(line = consoleBr.readLine()).equalsIgnoreCase("Exit"))
		{
			byte buff[] = line.getBytes();
			DatagramPacket packet = new DatagramPacket(buff,buff.length,address,3333);
			socket.send(packet);


			byte incomingBuffer[] = new byte[65536];
			DatagramPacket incomingPacket = new DatagramPacket(incomingBuffer,65535);
			socket.receive(incomingPacket);
			System.out.println(new String(incomingBuffer));
		}
	}
}