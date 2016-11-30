import java.util.Scanner;

public class TesteMatematicas{
	public static void main (String args[]) {
		int numero;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		System.out.printf("El numero %d es par? %b%n", numero, Matematicas.esPar(numero));
	}
}
		
