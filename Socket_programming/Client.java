import java.io.*;
import java.net.*;
import java.util.*;


public class Client{
	
	public static void main(String[]  args)
	{
		
		try {
			
			System.out.println("Connecting to the server....");
			Socket s = new Socket("127.168.56.1",8888);
			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			
           DataInputStream sin  = new DataInputStream(s.getInputStream());			
           DataOutputStream sout = new DataOutputStream(s.getOutputStream());
           
           
           String line = "";
           String line1 = "";
           while(!line.equals("Bye")) {
        	   
        	   line = input.readLine();
        	   sout.writeUTF(line);
        	   
        	   line1 = sin.readUTF();
        	   System.out.println("Jaywant : "+line1);
        	   
           }
           
           s.close();
           input.close();
           sin.close();
           sout.close();
           System.out.println("Chatting is Done!");
			
		}
		
		
		
		
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}