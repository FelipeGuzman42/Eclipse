import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ProtocoloCliente {
    public static void procesar(BufferedReader stdIn, BufferedReader pIn, PrintWriter pOut) throws IOException{
        System.out.println("Escriba el mensaje para enviar: ");
        String fromUser = stdIn.readLine();
        //envia por la red
        pOut.println(fromUser);
        String fromServer = "";
        /** lee lo que llega por la red
         * si lo que llega del servidor no es null
         * observe la asignación luego la condición
         */
        if ((fromServer = pIn.readLine()) != null){
            System.out.println("Respuesta del Servidor: "+fromServer);
        }
    }
}
