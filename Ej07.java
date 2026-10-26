import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Introduce el texto");
			String texto = scan.nextLine();
		System.out.println("Introduce la palabra a reemplazar");
			String buscar = scan1.nextLine();
		System.out.println("Introduce la palabra reemplazo");
			String reemplazo = scan2.nextLine();
		System.out.println(reemplazar(texto, buscar, reemplazo));
	}
	
	public static String reemplazar(String texto, String buscar, String reemplazo) {
	 if (buscar.length() == 0) return texto;
	 StringBuilder resultado = new StringBuilder();
	 int i = 0;
	 while (i < texto.length()) {
	 	if (coincide(texto, buscar, i)) {
		resultado.append(reemplazo);
		i += buscar.length();
		} else {
			resultado.append(texto.charAt(i));
			i++;
		}
	 }
	 return resultado.toString();
	}

	private static boolean coincide(String texto, String buscar, int inicio) {
		if (buscar.length() > texto.length() - inicio) return false;
		for (int j = 0; j< buscar.length(); j++) {
			if (texto.charAt(inicio + j) != buscar.charAt(j)) return false;
		}
		return true;
	}
}
