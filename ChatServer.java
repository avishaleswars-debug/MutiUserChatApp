import java.net.*;
import java.util.ArrayList;

public class ChatServer {

    public static void main(String[] args)throws Exception{
        ArrayList<Socket> arr=new ArrayList<>();
        ServerSocket server=new ServerSocket();
Socket socket=server.accept();
arr.add(socket);

    }
}