package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double mediaDoLeozinho, somaDoLeozinho, leozinhoContagem;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int[] leozinho = new int[n];

		for (int i = 0; i < leozinho.length; i++) {
			System.out.print("Digite um numero: ");
			leozinho[i] = sc.nextInt();
		}

		mediaDoLeozinho = 0.0;
		somaDoLeozinho = 0.0;
		leozinhoContagem = 0.0;
		for (int i = 0; i < leozinho.length; i++) {
			if (leozinho[i] % 2 == 0) {
				leozinhoContagem++;
				somaDoLeozinho += leozinho[i];
			}
		}

		if (leozinhoContagem > 0.0) {
			mediaDoLeozinho = somaDoLeozinho / leozinhoContagem;
			System.out.printf("MEDIA DOS PARES = %.1f%n", mediaDoLeozinho);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}
}