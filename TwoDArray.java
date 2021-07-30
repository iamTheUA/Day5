package Day5;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter Number of rows: %n");
		int n = sc.nextInt();
		System.out.printf("Enter Number of columns: %n");
		int m = sc.nextInt();
		int [][] arr= new int[n][m];
		System.out.println("Enter Values: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		sc.close();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
