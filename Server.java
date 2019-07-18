import java.net.*;
import java.io.*;



public class Server{
	
	public static void main(String[] args)
	{
		
		try {
			
				System.out.println("Waiting for connection....");
				ServerSocket ss = new ServerSocket(8888);
				Socket s = ss.accept();
				System.out.println("Connection Established!");
				
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				DataInputStream din = new DataInputStream(s.getInputStream());
				DataOutputStream dout = new DataOutputStream(s.getOutputStream());
				
				String str = "";
				String str1 = "";
				while(!str.equals("Bye")) {
					
				str = din.readUTF();
				System.out.println("Yashwant : "+str);
				str1 = input.readLine();
				dout.writeUTF(str1);
				
				
				}
				ss.close();
				s.close();
				input.close();
				din.close();
				dout.close();
				System.out.println("Chatting is Done!");
		}
		
		catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	
}