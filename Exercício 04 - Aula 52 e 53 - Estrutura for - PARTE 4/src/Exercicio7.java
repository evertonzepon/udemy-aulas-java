import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int x = (int) Math.pow(i, 2);
			int y = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d%n", i, x, y);
		}
		sc.close();
	}
}