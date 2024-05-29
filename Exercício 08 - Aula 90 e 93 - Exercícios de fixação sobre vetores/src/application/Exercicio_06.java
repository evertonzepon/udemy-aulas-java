package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();

		int[] arrayA = new int[n];
		int[] arrayB = new int[n];
		int[] arrayC = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < arrayB.length; i++) {
			arrayB[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			arrayC[i] = arrayA[i] + arrayB[i];
		}
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < n; i++) {
			System.out.printf("%d%n", arrayC[i]);
		}
		sc.close();
	}
}