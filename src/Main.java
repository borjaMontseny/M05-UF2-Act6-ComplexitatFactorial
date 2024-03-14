import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		calcularFactorial(sc);

		sc.close();
	}

	public static void calcularFactorial(Scanner sc) {
		int numero;
		int factorial = 1;

		System.out.print("Introdueix un nombre: ");
		numero = sc.nextInt();

		if (numero > 0) {
			for (int i = numero; i > 0; i--) {
				factorial = factorial * i;
			}
			System.out.println("El factorial de " + numero + " és " + factorial + ".");
		} else if (numero == 0) {
			System.out.println("El factorial de " + numero + " és 1.");
		} else {
			System.out.println("El nombre " + numero + " no té factorial.");
		}

	}

}
