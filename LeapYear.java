package Day5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int year;
		System.out.println("Enter an Year: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		sc.close();
		int temp = year;
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		if (count == 4) {
			boolean leap;
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0)
						leap = true;
					else
						leap = false;
				} else
					leap = true;
			} else
				leap = false;

			if (leap)
				System.out.println(year + " is a leap year.");
			else
				System.out.println(year + " is not a leap year.");

		} else
			System.out.print("Enter 4 digit Year ");
	}
}
