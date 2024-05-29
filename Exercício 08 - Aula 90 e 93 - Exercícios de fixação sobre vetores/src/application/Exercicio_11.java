package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, manQuantity, womanQuantity;
		double lowerHeight, higherHeight, averageWomanHeight, totalWomanHeight;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		double[] height = new double[n];
		char[] genre = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			height[i] = sc.nextDouble();

			sc.nextLine();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genre[i] = sc.next().charAt(0);
		}

		lowerHeight = height[0];
		higherHeight = height[0];

		for (int i = 0; i < n; i++) {
			if (height[i] < lowerHeight) {
				lowerHeight = height[i];
			}
			if (height[i] > higherHeight) {
				higherHeight = height[i];
			}
		}

		womanQuantity = 0;
		manQuantity = 0;
		totalWomanHeight = 0.0;

		for (int i = 0; i < n; i++) {
			if (genre[i] == 'M') {
				manQuantity++;
			} else {
				womanQuantity++;
				totalWomanHeight = totalWomanHeight + height[i];
			}
		}
		averageWomanHeight = totalWomanHeight / womanQuantity;

		System.out.printf("Menor altura = %.2f%n", lowerHeight);
		System.out.printf("Maior altura = %.2f%n", higherHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", averageWomanHeight);
		System.out.printf("Numero de homens = %d", manQuantity);

		sc.close();
	}
}