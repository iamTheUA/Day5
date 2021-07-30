package Day5;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Quadratic Eq= a*x*x + b*b + c = 0");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		float a = sc.nextFloat();
		System.out.print("Enter b: ");
		float b = sc.nextFloat();
		System.out.print("Enter c: ");
		float c = sc.nextFloat();
		sc.close();

		float root1 = (float) ((-b + Math.sqrt(((b * b) - (4 * a * c)))) / 2 * a);
		float root2 = (float) ((-b - Math.sqrt(((b * b) - (4 * a * c)))) / 2 * a);
		System.out.printf("Root 1 is : %.2f%n", root1);
		System.out.printf("Root 2 is : %.2f%n", root2);
	}

}
