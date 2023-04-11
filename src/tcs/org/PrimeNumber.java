package tcs.org;

import java.util.Iterator;

public class PrimeNumber {
	public static void main(String[] args) {

		int num = 29;
		int count;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count = count + 1;

			}

			if (count == 2) {
				System.out.println("primenumber:" + num);

			} else {
				System.out.println("not a prime number");
			}

		}

		else {
			System.out.println("not a prime number");
		}

	}

}
