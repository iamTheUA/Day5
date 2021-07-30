package Day5;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		System.out.println("Enter A: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter B: ");
		int b=sc.nextInt();
		System.out.println("Now...");
		int temp=a;
		sc.close();
		a=b;
		b=temp;
		System.out.printf("A: %d B: %d",a,b);
	}

}
