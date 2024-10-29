package BEE1035;

import java.util.Scanner;

public class BEE1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int Y, Z;
		
		Y = C + D;
		Z = A + B;
		
		if( B > C && D > A && Y > Z && C  > 0 && D > 0 && A % 2 == 0 ) {
			
			System.out.println("Valores aceitos");
				
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();
		

	}

}

