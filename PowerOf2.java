package Day5;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Power: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n ; i++) {
			System.out.println((int)Math.pow(n, i));
		}

	}

}
