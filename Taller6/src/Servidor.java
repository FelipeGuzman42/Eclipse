import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static final int PUERTO = 3400;
    public static void main(String args[]) throws IOException{
        ServerSocket ss = null;
        boolean continuar = true;
        System.out.println("Main server ...");
        try{
            ss = new ServerSocket(PUERTO);
        } catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
        while(continuar){
            //Crear el socket en el lado servidor
            //Queda bloqueado esperando a que llegue un cliente
            Socket socket = ss.accept();
            try{
                //se conectan los flujos, tanto de salida como de entrada
                PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //se ejecuta le protocolo en el lado servidor
                ProtocoloServidor.procesar(lector, escritor);
                //se cierran los flujos y el socket
                escritor.close();
                lector.close();
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
