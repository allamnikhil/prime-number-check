package interview;

import java.util.Scanner;

public class primechecck {
	static Scanner d = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a number");
		int a = d.nextInt();
		int b = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				b++;
			}
		}
		if (b == 2)
			System.out.println("it is a prime");
		else
			System.out.println("not a prime");

	}
}
