import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.*;

public class Simetric4{
	private final static String PADDING = "AES/ECB/PKCS5Padding";
	private final static String ALGORITMO = "AES";
	private static Scanner lector;
	
	public static void main(String[] args) throws NoSuchAlgorithmException{
		FileInputStream archivo;
		ObjectInputStream ois;
		SecretKey llave = null;
		byte[] textoCifrado = null;
		try {
			archivo = new FileInputStream("./data/llavesecreta.txt");
			ois = new ObjectInputStream(archivo);
			llave = (SecretKey) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			archivo = new FileInputStream("./data/mensajesecreto.txt");
			ois = new ObjectInputStream(archivo);
			textoCifrado = (byte[]) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		byte[] descifrado = descifrar(llave, textoCifrado);
		System.out.print("Texto descifrado: ");
		imprimir(descifrado);
		String des = new String(descifrado);
		System.out.print("Texto descifrado: "+ des);
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
	
	public static byte[] descifrar(SecretKey llave, byte[] texto) {
		byte[] textoClaro;
		
		try {
			Cipher cifrador = Cipher.getInstance(PADDING);
			cifrador.init(Cipher.DECRYPT_MODE, llave);
			textoClaro = cifrador.doFinal(texto);
		} catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
			return null;
		}
		return textoClaro;
	}
	
	public static void imprimir(byte[] contenido) {
		int i = 0;
		for(; i<contenido.length -1; i++) {
			System.out.print(contenido[i] + " ");
		}
		System.out.println(contenido[i] + "");
	}
}
