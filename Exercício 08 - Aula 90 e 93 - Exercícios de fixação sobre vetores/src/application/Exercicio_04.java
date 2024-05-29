package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, pairsTotal;

		System.out.print("Quantos numeros voce vai digitar? ");
		number = sc.nextInt();

		int[] integer = new int[number];

		for (int i = 0; i < integer.length; i++) {
			System.out.print("Digite um numero: ");
			integer[i] = sc.nextInt();
		}

		System.out.printf("%nNUMEROS PARES:%n");

		pairsTotal = 0;
		for (int i = 0; i < integer.length; i++) {
			if (integer[i] % 2 == 0) {
				pairsTotal++;
				System.out.printf("%d ", integer[i]);
			}
		}
		System.out.printf("%n%nQUANTIDADE DE PARES = %d", pairsTotal);

		sc.close();
	}
}
