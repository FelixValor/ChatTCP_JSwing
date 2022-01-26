package ServerPackage;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int MAXCLIENTS = 5;
    private static final int PORT = 4444;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            System.out.println("[+] Servidor Iniciado\n#####################");

            Socket[] clientsSockets = new Socket[MAXCLIENTS];

        }catch (Exception e){
            System.err.println("Server Error: "+e.getMessage());
        }
    }

}
