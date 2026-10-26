import java.util.Scanner;

public class Array02 {
	public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer numero (binario)");
		String a = scan.nextLine();
		System.out.println("Introduce el segundo numero (binario)");
		String b = scan.nextLine();

		System.out.println(addBin(a, b));
	}

	public String addBin(String a, String b) {
		int n = Math.max(a.length(), b.length());
		int[] res = new int[n + 1];

		int i = a.length() - 1;
		int j = b.length() - 1;
		int k = n;
		int acc = 0;

		while (i >= 0 || j >= 0 || acc > 0) {
		   int suma = acc;
		   if (i >= 0) {
		   suma += a.charAt(i) - '0';
		   i--;
		   }
		   if (j >= 0) {
		   suma += b.charAt(j) - '0';
		   j--;
		   }
		   res[k] = suma % 2;
		   acc = suma / 2;
		   k--;		   
	} 

	int inicio = 0;
	while (inicio < res.length - 1 && res[inicio] == 0) {
	inicio ++;
	}

	String resultado = "";
	for (int p = inicio; p < res.length; p++) {
	resultado += res[p];
	}
	return resultado;

	}
}
