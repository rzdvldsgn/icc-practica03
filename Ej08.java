import java.util.Scanner;

public class Ej08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el texto");
			String texto = scan.nextLine();

		System.out.println(invertirPalabras(texto));
	}
	
	public static String invertirPalabras(String texto) {
		if (texto.length() == 0) return "";
		StringBuilder resultado = new StringBuilder();
		int der = texto.length() - 1;
		int spc = 0;

		while (der >= 0) {
			int fin = der + 1;
			while (der >= 0 && texto.charAt(der) != ' ') der--;
			resultado.append(texto, der + 1, fin);

			while (spc < texto.length() && texto.charAt(spc) != ' ') spc++;
			while (spc < texto.length() && texto.charAt(spc) == ' ') {
			resultado.append(' ');
			spc++;
			}
			while (der >= 0 && texto.charAt(der) == ' ') der--;
		}
		return resultado.toString();
	}
}
