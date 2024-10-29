package BEE1046;

import java.util.Scanner;

public class BEE1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int INICIO = sc.nextInt();
		int FIM = sc.nextInt();
		int duracao = 0;

		if (FIM > INICIO) {

			duracao = FIM - INICIO;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else {
			
			duracao = 24 - INICIO + FIM;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}

		sc.close();

	}

}
