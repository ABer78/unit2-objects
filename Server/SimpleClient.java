import java.util.*;
import java.io.*;
import java.net.*;

public class SimpleClient {
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleClient(String ip, int port) throws Exception {
        socket = new Socket(ip, port);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new Scanner(socket.getInputStream());
    }
    public void sendMessage(String msg) {
        out.println(msg);
        out.flush();
    }
    public String recieveMessage() {
        return in.nextLine();
    }
    public void close() throws Exception {
        socket.close();
        out.close();
        in.close();
    }
    public static void main(String[] args) throws Exception {
        SimpleClient simpleClient = new SimpleClient("127.0.0.1", 9090);
        Scanner input = new Scanner(System.in);
        while(true){
            String message = input.nextLine();
            simpleClient.sendMessage(message);
            String serverR = simpleClient.recieveMessage();
            System.out.println("Server: " + serverR);
            if (serverR.equals("stop")){
                break;
            }
        }
        simpleClient.close();
    }
}
