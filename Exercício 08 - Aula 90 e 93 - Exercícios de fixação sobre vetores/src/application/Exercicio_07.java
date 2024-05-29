package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double sum = 0, average = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] numbers = new double[n];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		average = sum / n;
		System.out.printf("%nMEDIA DO VETOR = %.3f%n", average);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] < average) {
				System.out.printf("%.1f%%n", numbers[i]);
			}
		}
		sc.close();
	}
}
