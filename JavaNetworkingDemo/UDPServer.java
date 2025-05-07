import java.io.*;
import java.net.*;

class UDPServer
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket socket = new DatagramSocket(3333);

		while(true)
		{
			byte[] buffer = new byte[65536];

			DatagramPacket receivedPacket = new DatagramPacket(buffer,65535);
			socket.receive(receivedPacket);

			int clientPort = receivedPacket.getPort();
			InetAddress clientAddress = receivedPacket.getAddress();
			String receivedLine = "Server : " + (new String(buffer).trim());
			System.out.println("Server got : " + new String(buffer));

			byte[] sendingBuffer = receivedLine.getBytes();

			DatagramPacket sendingPacket = new DatagramPacket(sendingBuffer,sendingBuffer.length,clientAddress,clientPort);
			socket.send(sendingPacket);
		}
	}
}