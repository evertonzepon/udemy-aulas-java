package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double averageGrade;

		System.out.printf("Quantos alunos serao digitados? ");
		n = sc.nextInt();

		String[] name = new String[n];
		double[] grade1 = new double[n];
		double[] grade2 = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
			name[i] = sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados:");

		averageGrade = 0.0;
		for (int i = 0; i < n; i++) {
			averageGrade = (grade1[i] + grade2[i]) / 2.0;
			if (averageGrade >= 6.0) {
				System.out.printf("%s%n", name[i]);

			}
		}
		sc.close();
	}
}