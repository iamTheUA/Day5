package Day5;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Dividend: ");
		float dend=sc.nextFloat();
		System.out.print("Enter Divisor: ");
		float dsor=sc.nextFloat();
		sc.close();
		System.out.println("Remainder is "+ dend%dsor);
		System.out.print("Quotient is "+ dend/dsor);
	}

}
