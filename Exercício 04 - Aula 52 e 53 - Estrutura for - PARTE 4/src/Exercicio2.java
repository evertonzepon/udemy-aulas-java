import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < N; i++) {
			int valor = sc.nextInt();

			if (valor >= 10 && valor <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}
}