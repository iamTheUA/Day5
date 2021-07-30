package Day5;

import java.util.Scanner;

public class MaxIn3Numbers {

	public static void main(String[] args) {
		System.out.print("Enter 3 Numbers: ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		if(a>b && a>c) {
			System.out.printf("%d is largest", a);
		}
		else if(b>a && b>c) {
			System.out.printf("%d is largest", b);
		}
		else
			System.out.printf("%d is largest", c);
	}

}
