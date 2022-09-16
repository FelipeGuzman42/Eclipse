import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.*;

public class Simetric3{
	private final static String PADDING = "AES/ECB/PKCS5Padding";
	private final static String ALGORITMO = "AES";
	private static Scanner lector;
	
	public static void main(String[] args) throws NoSuchAlgorithmException{
		lector = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		String text = lector.next();
		System.out.println("El texto recibido es: " +text);
		System.out.print("Texto claro: ");
		imprimir(text.getBytes());
		KeyGenerator keygen = KeyGenerator.getInstance(ALGORITMO);
		SecretKey k1 = keygen.generateKey();
		FileOutputStream archivo;
		ObjectOutputStream oos;
		try {
			archivo = new FileOutputStream("./data/llavesecreta.txt");
			oos = new ObjectOutputStream(archivo);
			oos.writeObject(k1);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		byte[] tc1 = cifrar(k1, text);
		
		try {
			archivo = new FileOutputStream("./data/mensajesecreto.txt");
			oos = new ObjectOutputStream(archivo);
			oos.writeObject(tc1);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] cifrar(SecretKey llave, String texto) {
		byte[] textoCifrado;
		
		try {
			Cipher cifrador = Cipher.getInstance(PADDING);
			byte[] textoClaro = texto.getBytes();
			
			cifrador.init(Cipher.ENCRYPT_MODE, llave);
			textoCifrado = cifrador.doFinal(textoClaro);
			
			return textoCifrado;
		} catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
			return null;
		}
	}
	
	public static void imprimir(byte[] contenido) {
		int i = 0;
		for(; i<contenido.length -1; i++) {
			System.out.print(contenido[i] + " ");
		}
		System.out.println(contenido[i] + "");
	}
}
