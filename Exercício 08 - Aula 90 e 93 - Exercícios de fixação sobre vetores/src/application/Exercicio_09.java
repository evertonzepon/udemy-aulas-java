package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, olderAge = 0, olderName = 0;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();

		String[] name = new String[n];
		int[] age = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);

			System.out.print("Nome: ");
			name[i] = sc.next();

			System.out.print("Idade: ");
			age[i] = sc.nextInt();

			if (age[i] > olderAge) {
				olderAge = age[i];
				olderName = i;
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s%n", name[olderName]);

		sc.close();
	}
}