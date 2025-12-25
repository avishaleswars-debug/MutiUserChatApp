
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args)throws IOException {
        Socket s=new Socket("localhost",9999);
          DataOutputStream ds=new DataOutputStream(s.getOutputStream());
                DataInputStream io=new DataInputStream(s.getInputStream());
                Scanner sc=new Scanner(System.in);
               new Thread(()->{try {while (true) {
                    
String li=io.readUTF();
System.out.println("Server  "+li);
               }
            }
               catch(Exception e){
                System.out.println(e);
               }
    }).start();
                while (true) {
  String line=sc.nextLine();
                    ds.writeUTF(line);
            
                }
              
    }
}