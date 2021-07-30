package Day5;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int prime=0;
		sc.close();
		for (int i = 2; i < n; i++) {
			int temp = n % i;
			if (temp == 0) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						prime = 1;
					} 
				}
				if (prime==1) {
					System.out.println(i);
				}
			}
		}

	}

}
