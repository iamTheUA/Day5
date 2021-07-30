package Day5;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		System.out.print("Enter Point: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("x coordinate: ");
		int x = sc.nextInt();
		System.out.print("y cordinate: ");
		int y = sc.nextInt();
		sc.close();
		System.out.printf("Distance from Origin: %.2f", Math.sqrt(x * x + y * y));
	}

}
