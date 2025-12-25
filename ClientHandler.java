import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    private DataInputStream di;
    private DataOutputStream dos;
      private  String name;
   
    ClientHandler(Socket socket){
        this.socket=socket;
     
        try {
            di=new DataInputStream(socket.getInputStream());
            dos=new DataOutputStream(socket.getOutputStream());
            name=di.readUTF();
            System.out.println(name+" has joined the group");
        } catch (Exception e) {
           System.out.println(e);
        }
    
}
        public void run(){
           
            try{
while (true) {
    String line=di.readUTF();
    for (ClientHandler s : ChatServer.arr) {
        s.dos.writeUTF(name+" "+line);
    }  
    }
            }
            catch(Exception e) {
               System.out.println(name + " disconnected");
            }    
}
}