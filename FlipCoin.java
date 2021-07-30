package Day5;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		float head = 0;
		float tail = 0;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				int flip = rand.nextInt(2);
				if (flip == 0) {
					head += 1;
				} else
					tail += 1;
			}
		} 
		else
			System.out.print("Not a Valid Number!");
		System.out.printf("Head Percentage: %.2f%n", (head/(head+tail))*100 );
		System.out.printf("Head Percentage: %.2f", (tail/(head+tail))*100 );
		
	}
}
