package Day5;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		sc.close();
		if (n % 2 == 0) {
			System.out.printf("%d is Even", n);
		} else
			System.out.printf("%d is Odd", n);

	}

}
