import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int qte = sc.nextInt();

		double total = 0.0;

		if (cod == 1) {
			total = qte * 4.0;
		} else if (cod == 2) {
			total = qte * 4.5;
		} else if (cod == 3) {
			total = qte * 5.0;
		} else if (cod == 4) {
			total = qte * 2.0;
		} else if (cod == 5) {
			total = qte * 1.5;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}
}