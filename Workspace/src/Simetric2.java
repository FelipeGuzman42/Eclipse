import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.*;

public class Simetric2{
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
		SecretKey k2 = keygen.generateKey();
		
		byte[] tc1 = cifrar(k1, text);
		byte[] tc2 = cifrar(k2, text);
		System.out.print("Texto cifrado: ");
		imprimir(tc1);
		
		byte[] descifrado = descifrar(k2, tc1);
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
