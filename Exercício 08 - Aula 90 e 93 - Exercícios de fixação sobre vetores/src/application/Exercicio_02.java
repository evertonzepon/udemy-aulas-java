package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double sum, avg;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		System.out.printf("%nSOMA = %.2f%n", sum);
		avg = sum / vect.length;
		System.out.printf("MEDIA = %.2f", avg);

		sc.close();
	}
}