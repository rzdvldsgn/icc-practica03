import java.util.Scanner;

public class Ej06 {
	public static void main (String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Introduce el texto");
		String texto = scan.nextLine();

		System.out.println(eliminarDuplicado(texto));
	}

	public static String eliminarDuplicado(String texto) {
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < texto.length(); i ++) {
			char actual = texto.charAt(i);
			if (!contiene(resultado, actual)) resultado.append(actual);
		}
		return resultado.toString();
	}

	private static boolean contiene(StringBuilder texto, char buscado) {
	 for (int i = 0; i < texto.length(); i++) {
	 	if (texto.charAt(i) == buscado) return true;
	 }
	 return false;

	}

}
