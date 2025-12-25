import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    private DataInputStream di;
    private DataOutputStream dos;
    ClientHandler(Socket socket){
        this.socket=socket;
        try {
            di=new DataInputStream(socket.getInputStream());
            dos=new DataOutputStream(socket.getOutputStream());
        } catch (Exception e) {
           System.out.println(e);
        }
    
}
        public void run(){
           
            try{
while (true) {
    String line=di.readUTF();
    for (ClientHandler s : ChatServer.arr) {
        s.dos.writeUTF(line);
    }
        
    }

            }
            catch(Exception e) {
                System.out.println(e);
            }
        
}

}