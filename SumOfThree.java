package Day5;

import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter Number3: ");
		int num3 = sc.nextInt();
		sc.close();
		int sum = num1 + num2 + num3;
		if (sum == 0) {
			System.out.print("Sum is Zer0");
		} else
			System.out.print("Sum is not Zer0");
	}

}
