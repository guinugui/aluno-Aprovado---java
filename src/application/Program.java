package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o nome do Estudante: ");
		String nome = sc.nextLine();

		System.out.println("Digite a primeira nota: ");
		double primeiraNota = sc.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double segundaNota = sc.nextDouble();

		System.out.println("Digite a terceira nota: ");
		double terceiraNota = sc.nextDouble();

		Estudante estudante = new Estudante(nome, primeiraNota, segundaNota, terceiraNota);

		double media = estudante.media();

		System.out.println("Nota final de " + estudante.media());

		if (media < 60.0) {

			System.out.println("Nao foi aprovador");
			System.out.println("Falta de " + String.format("%.2f", estudante.faltandoPontos()) + "pontos!");
		} else {

			System.out.println("Estudante Aprovado !");
		}

		sc.close();

	}

}
