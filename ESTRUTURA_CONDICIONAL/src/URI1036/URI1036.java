package URI1036;

import java.util.Locale;
import java.util.Scanner;

public class URI1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double delta, A, B, C, R1, R2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
	
		delta = Math.pow(B, 2.0) - 4*A*C;
		R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
		R2 = (-B - Math.sqrt(delta)) / (2.0 * A);
		
		if(delta < 0 || A == 0) {
			
			System.out.println("Impossivel calcular");
			
			}
		else {
			
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
			
		}

		sc.close();
	}

}
