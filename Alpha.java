package Day5;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		System.out.print("Enter an alphabet: ");
		Scanner sc = new Scanner(System.in);
		String d = sc.next().toLowerCase();
		char c = d.charAt(0);
		sc.close();
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.print("It's a vowel");
		} else
			System.out.print("It's a Consonant");
	}
}
