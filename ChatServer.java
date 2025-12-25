//import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
 static ArrayList<ClientHandler> arr=new ArrayList<>();
    public static void main(String[] args)throws Exception{
        ServerSocket server=new ServerSocket(9999);
        while(true){
Socket socket=server.accept();

ClientHandler client =new ClientHandler(socket);
arr.add(client);
       new Thread(client).start();
    }

    }
}