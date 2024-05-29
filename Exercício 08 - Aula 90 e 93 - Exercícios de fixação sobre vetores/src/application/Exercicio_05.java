package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, highValuePosition = 0;
		double highValue = 0.0;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] numbers = new double[n];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
			
			if (numbers[i] > highValue) {
				highValue = numbers[i];
				highValuePosition = i;
			}
		}
		System.out.printf("%nMAIOR VALOR = %.1f%n", highValue);
		System.out.printf("POSICAO DO MAIOR VALOR = %d%n", highValuePosition);

		sc.close();
	}
}