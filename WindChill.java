package Day5;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temprature: ");
		float t = sc.nextFloat();
		System.out.print("Enter Velocity: ");
		float v = sc.nextFloat();
		sc.close();
		double w = 35.74 + (t * 0.6215) + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));
		System.out.printf("the wind chill to be: %.2f", w);

	}

}
