package br.fai.ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a idade: ");
		int idade = scanner.nextInt();
		
		if (idade > 20) {
			System.out.println("A idade deve maior que 20.");
		} else if (idade > 12 && idade < 17) {
			System.out.println("A idade está entre 12 e 17.");
		} else if (idade == 7 || idade < 5) {
			System.out.println("A idade é igual a 7 ou menor que 5");
		} else {
			System.out.println("Outras combinações.");
		}
	}
}
