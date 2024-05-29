import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hour;
		double moneyPerHour, salary;
		
		number = sc.nextInt();
		hour = sc.nextInt();
		moneyPerHour = sc.nextDouble();
		
		salary = hour * moneyPerHour;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		sc.close();
		

	}

}