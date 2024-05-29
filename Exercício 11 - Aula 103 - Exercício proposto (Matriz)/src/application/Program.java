package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número de linhas: ");
		int m = sc.nextInt();
		System.out.print("Insira o número de colunas: ");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		sc.nextLine();

		System.out.println("Insira o valor de x: ");
		int x = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (x == matriz[i][j]) {
					System.out.println("Position " + i + ", " + j + ":");
					if (j > 0) {
						System.out.println("Left: " + (matriz[i][j - 1]));
					}
					if (i > 0) {
						System.out.println("Up: " + (matriz[i - 1][j]));
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + (matriz[i][j + 1]));
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + (matriz[i + 1][j]));
					}
				} else {
					while (x != matriz[i][j]) {
						System.out.print("Valor não encontrado! Insira um número válido contido na matriz: ");
						x = sc.nextInt();
					}
				}
			}
		}
		sc.close();
	}
}