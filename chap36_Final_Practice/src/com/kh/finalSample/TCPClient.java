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
			//클라이언트와 통신을 위한 입출력 스트림 설정.
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream out = socket.getOutputStream();
			//클라이언트에서 서버로 메시지 전송.
			String msg = "Hi, Server!";
			out.write(msg.getBytes());
			out.flush();
			
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}