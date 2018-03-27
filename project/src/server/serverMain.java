package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverMain {
	
	public static void main(String[] args) {
		InputStream is;
		OutputStream os;
		ObjectInputStream ois;
		ObjectOutputStream oos;
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(8283);
			System.out.println("serverOpen");
			Socket socket = serverSocket.accept();
			
			System.out.println("serverConnected");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			ois = new ObjectInputStream(is);
			oos = new ObjectOutputStream(os);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
