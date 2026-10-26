import java.util.Scanner;

public class Ej09 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la expresion");
		String expresion = scan.nextLine();

		System.out.println(validar(expresion));
	}

	public static boolean validar(String expresion) {
		StringBuilder pendientes = new StringBuilder();
		for (int i = 0; i < expresion.length(); i++) {
			char c = expresion.charAt(i);
		if (esApertura(c)) {
		  pendientes.append(c);
		} else if (esCierre(c)) {
			if (pendientes.length() == 0) return false;
			int ultima = pendientes.length() - 1; 
			if (!corresponden(pendientes.charAt(ultima), c)) return false;
			pendientes.deleteCharAt(ultima);
		}
	}
	return pendientes.length() == 0;
	}

	private static boolean esApertura(char c) {
		return c == '(' || c == '[' || c == '{';
	}

	private static boolean esCierre(char c) {
		return c == ')' || c == ']' || c == '}';
	}

	private static boolean corresponden(char ap, char cierre) {
		return (ap == '(' && cierre == ')')
			|| (ap == '[' && cierre == ']')
			|| (ap == '{' && cierre == '}');
	}

}
