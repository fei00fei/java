package ShiYan5;

import java.util.Arrays;

public class Mylnteger {
	private static int value;

	public Mylnteger(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	static boolean b1(int x1) {
		if (x1 % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean b2(int x1) {
		if (x1 % 2 == 0) {
			return false;
		} else {
			return true;
		}

	}

	static boolean b3(int x1) {
		for (int i = 2; i < x1; i++) {
			if (x1 % i == 0) {
				return false;
			}
		}
		return true;

	}

	public boolean isEven() {
		return b1(value);
	}

	public boolean isOdd() {
		return b2(value);

	}

	public boolean isPrime() {
		return b3(value);

	}

	static boolean isEven(int x2) {
		return b1(x2);

	}

	static boolean isOdd(int x2) {
		return b2(x2);

	}

	static boolean isPrime(int x2) {
		return b3(x2);

	}

	boolean equals(int x3) {
		if (value == x3) {
			return true;
		} else {
			return false;
		}

	}

	boolean equals(Mylnteger x4) {
		if (x4.value == value) {
			return true;
		} else {
			return false;
		}

	}

	static int parseInt(char[] x5) {
		int sum = 0;
		System.out.println(Arrays.toString(x5));
		for (int i = 0; i < x5.length; i++) {
//			sum += (x7[i] - '0' + sum * 10);
			sum += x5[i] - '0';
			sum *= 10;

		}
		return sum / 10;

	}

	static int parseInt(String x6) {
		char[] x7 = x6.toCharArray();
		System.out.println(Arrays.toString(x7));

		int sum = 0;
		for (int i = 0; i < x7.length; i++) {
//			sum += (x7[i] - '0' + sum * 10);
			sum += x7[i] - '0';
			sum *= 10;

		}
		return sum / 10;

	}
}
