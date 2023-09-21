package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient{
	public static void main(String[] args) throws Exception{
	
		int port = 1616;
		String serverIP;
	
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port);
			System.out.println("server connect");
			//Ŭ���̾�Ʈ�� ����� ���� ����� ��Ʈ�� ����.
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream out = socket.getOutputStream();
			//Ŭ���̾�Ʈ���� ������ �޽��� ����.
			String msg = "Hi, Server!";
			out.write(msg.getBytes());
			out.flush();
			
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}