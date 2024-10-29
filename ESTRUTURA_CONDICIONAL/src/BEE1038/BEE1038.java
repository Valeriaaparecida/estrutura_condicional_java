package BEE1038;

import java.util.Locale;
import java.util.Scanner;

public class BEE1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco, total;

		switch (codigo) {
		case 1:
			preco = 4.00;
			total = preco * quantidade;
			break;
		case 2:
			preco = 4.50;
			total = preco * quantidade;
			break;
		case 3:
			preco = 5.00;
			total = preco * quantidade;
			break;
		case 4:
			preco = 2.00;
			total = preco * quantidade;
			break;
		case 5:
			preco = 1.50;
			total = preco * quantidade;
			break;

		default:
			total = 0;

		}
		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}

}
