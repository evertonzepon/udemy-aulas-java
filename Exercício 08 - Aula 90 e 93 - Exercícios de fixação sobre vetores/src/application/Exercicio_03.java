package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Exercicio_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numberOfPeople;
		double sumOfHeights, averageHeight, lessThanSixteen;

		System.out.print("Quantas pessoas serao digitadas? ");
		numberOfPeople = sc.nextInt();

		Person[] person = new Person[numberOfPeople];

		for (int i = 0; i < person.length; i++) {
			sc.nextLine();

			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int age = sc.nextInt();

			System.out.print("Altura: ");
			double height = sc.nextDouble();

			person[i] = new Person(name, age, height);
		}
		
		sumOfHeights = 0.0;
		for (int i = 0; i < person.length; i++) {
			sumOfHeights += person[i].getHeight();
		}
		averageHeight = sumOfHeights / person.length;
		System.out.printf("%nAltura média: %.2f%n", averageHeight);

		lessThanSixteen = 0.0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				lessThanSixteen++;
			}
		}
		double percentualLessThanSixteen = lessThanSixteen / person.length * 100;

		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percentualLessThanSixteen);
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}

		sc.close();
	}
}
