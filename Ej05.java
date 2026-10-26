import java.util.Scanner;

public class Ej05 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el texto");
		String texto = scan.nextLine();
		if (esPalindromo(texto) == true) {
			System.out.println("Es Palindromo");
		} else {
			System.out.println("No es Palindromo");
		}

	}

	public static boolean esPalindromo(String texto) {
	int izq = 0;
	int der = texto.length() - 1;
	while (izq < der) {
	      char a = normalizar(texto.charAt(izq));
	      char b = normalizar(texto.charAt(der));
	      if (!esSignificativo(a)) {
	      	izq++;
	      } else if (!esSignificativo(b)) {
	      	der--;
	      } else if (a != b) {
	      	return false;
	      } else {
	      	izq++;
		der--;
	      }
	}
	return true;
	}

	private static char normalizar(char c) {
		String origen = "ABCDEFGHIJKLMNÑOPQRSTUVWXTZÁÉÍÓÚ";
		String destino = "abcdefghijklmnñopqrstuvwxyzáéíóú";
		int posicion = origen.indexOf(c);
		return posicion < 0 ? c : destino.charAt(posicion);
	}
	private static boolean esSignificativo (char c) {
		return (c >= 'a' && c <= 'z')
			|| (c >= '0' && c <= '9') || c == 'ñ' || c == 'ü';
	}

}
