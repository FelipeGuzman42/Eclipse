import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ProtocoloServidor {
    //observe que es un método estático
    public static void procesar(BufferedReader pIn, PrintWriter pOut) throws IOException{
        String inputLine;
        String outputLine;
        //lee del flujo de entrada
        inputLine = pIn.readLine();
        System.out.println("Entrada a procesar: "+inputLine);
        //procesa la entrada
        outputLine = inputLine;
        //escribe en el flujo de salida
        pOut.println(outputLine);
        System.out.println("Salida procesada: "+outputLine);
    }
}
