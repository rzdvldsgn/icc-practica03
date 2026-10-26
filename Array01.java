public class Array01 {
	public static void main(String[] args) {
	   int [] numeros = {8, 3, 10, 5, 4};

	   int suma = 0;
	   int mayor = numeros[0];

	   for (int n : numeros) {
	   	suma += n;
		if (n > mayor) {
		mayor = n;
		}
	   }
	double prom = (double) suma / numeros.length;

	System.out.println("Suma: " + suma);
	System.out.println("Promedio: " + prom);
	System.out.println("Mayor: " + mayor);
	}
}
