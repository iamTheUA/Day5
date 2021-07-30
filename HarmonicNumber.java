package Day5;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		float n = sc.nextInt();
		sc.close();
		double sum = 0;
		for (float i = 1; i <= n; i++) {
			sum = sum + (1 / i);
		}
		System.out.printf("Hermonic Number is %.3f", sum);
	}

}
