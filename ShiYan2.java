package firstcode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShiYan2 {

	public static void main(String[] args) {
		m36();
	}

	static void m1() {
		double x0, y0, x1, y1;
		System.out.print("Enter point 1 (latitude and longitude) in degrees:");
		Scanner in = new Scanner(System.in);
		x0 = in.nextDouble();
		y0 = in.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees:");

		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x0 = Math.toRadians(x0);
		y0 = Math.toRadians(y0);
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		double d;
		d = 6371.01 * Math.acos(Math.sin(x0) * Math.sin(x1) + Math.cos(x0) * Math.cos(x1) * Math.cos(y0 - y1));
		System.out.print("The distance between the two points is " + d);
	} // 39.55 -116.25
		// Enter point 2 (latitude and longitude) in degrees:41.5 87.37

	static void m2() {
		double s1, s2;
		System.out.print("Enter the numbers of sides:");
		Scanner in = new Scanner(System.in);
		s1 = in.nextDouble();
		System.out.print("Enter the  side:");
		s2 = in.nextDouble();
		double s3;
		s3 = s1 * Math.pow(s2, 2) / (4 * Math.tan(Math.PI / s1));
		System.out.print("The area of the polygom is " + s3);
	}

	static void m3() {
		double a1, x1, y1, a2, x2, y2, a3, x3, y3;
		a1 = Math.random() * Math.PI;
		a2 = Math.random() * Math.PI;
		a3 = Math.random() * Math.PI;

		x1 = 40 * Math.cos(a1);
		y1 = 40 * Math.sin(a1);

		x2 = 40 * Math.cos(a2);
		y2 = 40 * Math.sin(a2);

		x3 = 40 * Math.cos(a3);
		y3 = 40 * Math.sin(a3);

		double s1, s2, s3;

		s1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		s2 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		s3 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		// a^2=b^2+c^2-2bc cos(A)
		double A = Math.toDegrees(Math.acos((s1 * s1 - s2 * s2 - s3 * s3) / (-2 * s2 * s3)));
		double B = Math.toDegrees(Math.acos((s2 * s2 - s1 * s1 - s3 * s3) / (-2 * s1 * s3)));
		double C = Math.toDegrees(Math.acos((s3 * s3 - s2 * s2 - s1 * s1) / (-2 * s2 * s1)));

		System.out.print("三个角度是 " + A + " " + B + " " + C);
	}

	static void m4() {
		int n1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an ASCLL code:");
		n1 = in.nextInt();
		char n2;
		n2 = (char) n1;
		System.out.print("The character for ASCLL code " + n1 + " is " + n2);
	}

	static void m5() {
		System.out.print("Enter a character :");
		char n1;
		Scanner in = new Scanner(System.in);
		int n2;
		n1 = in.next().charAt(0);
		n2 = (int) n1;
		System.out.print("The Unicode for character " + n1 + " is " + n2);
	}

	static void m6() {
		System.out.print("Enter a hex character :");
		Scanner in = new Scanner(System.in);
		int n1 = -1;
		String h;
		h = in.nextLine();
		if (h.length() != 1) {
			System.out.print(h + " is an invalid input");
			System.exit(1);
		}
		char ch = Character.toUpperCase(h.charAt(0));
		if (ch <= 'F' && ch >= 'A') {
			n1 = ch - 'A' + 10;

		} else if (Character.isDigit(ch)) {
			n1 = (int) ch - 48;
			if (!(n1 >= 0 && n1 <= 15)) {

				System.out.print(ch + " is an invalid input");
				System.exit(1);
			}
		} else {
			System.out.print(ch + " is an invalid input");
			System.exit(1);
		}
		String er = " ";
		if (n1 == 0) {

			er = er + 0;

		}
		if (n1 >= 0 && n1 <= 15) {
			while (n1 > 0) {
				int n2 = n1 % 2;
				er = er + n2;
				n1 = n1 / 2;
			}
		}
		System.out.print("The binary value is " + er);
	}

	static void m7() {
		char n1;
		System.out.print("Enter a letter grade:");
		Scanner in = new Scanner(System.in);
		n1 = in.nextLine().charAt(0);
		if (n1 >= 'A' && n1 <= 'D') {
			System.out.print("The numeric value for grage  " + n1 + " is " + ('A' - n1 + 4));

		} else if (n1 == 'F') {
			System.out.print("The numeric value for grage  " + n1 + " is " + 0);

		} else {
			System.out.print(n1 + " is a invalid grade");
		}
	}

	static void m8() {
		char[] a = new char[26];
		for (int i = 0; i <= 25; i++) {
			a[i] = (char) ('a' + i);

		}

//		System.out.print(a[1]);
		System.out.print("Enter an uppercase letter :");
		char b;
		Scanner in = new Scanner(System.in);
		b = in.nextLine().charAt(0);
		if (!Character.isLetter(b)) {
			System.out.println(b + " is an invalid input");
			System.exit(1);
		}

		if (Character.isUpperCase(b)) {
			b = Character.toLowerCase(b);

		}
		int c = -1;
		for (int i = 0; i <= 25; i++) {
			if (b == a[i]) {
				c = i;
			}

		}
		if (c >= 0 && c <= 2) {
			System.out.print("The corresponding number is 2");
		}
		if (c > 2 && c <= 5) {
			System.out.print("The corresponding number is 3");
		}
		if (c >= 6 && c <= 8) {
			System.out.print("The corresponding number is 4");
		}
		if (c >= 9 && c <= 11) {
			System.out.print("The corresponding number is 5");
		}
		if (c >= 12 && c <= 14) {
			System.out.print("The corresponding number is 6");
		}
		if (c >= 15 && c <= 18) {
			System.out.print("The corresponding number is 7");
		}
		if (c >= 19 && c <= 21) {
			System.out.print("The corresponding number is 8");
		}
		if (c >= 22 && c <= 25) {
			System.out.print("The corresponding number is 9");
		}

	}

	static void m9() {
		String[] a = { "31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31", };
		System.out.print("Enter a year:");
		int y;
		Scanner in = new Scanner(System.in);
		y = in.nextInt();
		String[] b = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		in.nextLine();
		String n1;
		System.out.print("Enter a month (first three letters with the first letter in uppercase):");
		n1 = in.nextLine();
		int n2 = -1;
		for (int i = 0; i < 12; i++) {
			if (n1.equals(b[i])) {
				n2 = i;
			}

		}
		if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
			a[1] = "29";
		}
		if (n2 != -1) {
			System.out.println(b[n2] + " " + y + " has " + a[n2] + " days");
		}
	}

	static void m10() {
		System.out.print("Enter a SSN:");
		Scanner in = new Scanner(System.in);
		String mu = in.nextLine();
		Pattern zi = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
		Matcher a = zi.matcher(mu);
		System.out.print(a.matches());

	}

	static void m11() {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string s1:");

		s1 = in.nextLine();
//		in.nextLine();
		System.out.print("Enter string s2:");

		s2 = in.nextLine();
		if (s1.indexOf(s2) != -1) {
			System.out.print(s2 + " is a substring of " + s1);
		} else {
			System.out.println(s2 + " is not a substring of " + s1);
		}

	}

	static void m12() {
		String s1;
		double n1, n2, n3, n4;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter employee's name:");
		s1 = in.nextLine();
		System.out.print("Enter number of hours worked in a week:");
		n1 = in.nextDouble();
		System.out.print("Enter hourly pay rate :");
		n2 = in.nextDouble();
		System.out.print("Enter federal tax withholding rate:");
		n3 = in.nextDouble();
		System.out.print("Enter state tax withholding rate:");
		n4 = in.nextDouble();
		System.out.println();
		System.out.println();
		System.out.println("employee's name:    " + s1);
		System.out.println("hours worked:    " + n1);
		System.out.println("pay rate :    $" + n2);
		System.out.println("gross pay :    $" + n2 * n1);
		System.out.println("deductions:    ");
		System.out.println("    " + "federal withholding (20.0%):    $" + n2 * n1 * n3);
		System.out.println("    " + "state withholding (20.0%):    &" + n2 * n1 * n4);
		System.out.println("    " + "Total Deduction:    &" + (n2 * n1 * n3 + n2 * n1 * n4));
		System.out.print("Net Pay:    " + "$" + (n2 * n1 - n2 * n1 * n3 - n2 * n1 * n4));
	}

	static void m13() {
		String[] a = new String[3];
		System.out.print("Enter the first city :");
		Scanner in = new Scanner(System.in);
		a[0] = in.nextLine();
		System.out.print("Enter the second city :");
		a[1] = in.nextLine();
		System.out.print("Enter the third city :");
		a[2] = in.nextLine();
		String b;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
				}
			}

		}
		System.out.print("The three cities in alphabetical order are " + a[0] + " " + a[1] + " " + a[2]);
	}

	static void m14() {
		char n1, n2, n3;
		int n4, n5, n6, n7;
		n1 = (char) ((int) (Math.random() * ('Z' - 'A' + 1) + 'A'));
		n2 = (char) ((int) (Math.random() * ('Z' - 'A' + 1) + 'A'));
		n3 = (char) ((int) (Math.random() * ('Z' - 'A' + 1) + 'A'));
		n4 = (int) (Math.random() * 10);
		n5 = (int) (Math.random() * 10);
		n6 = (int) (Math.random() * 10);
		n7 = (int) (Math.random() * 10);
		System.out.print("车牌号是 " + n1 + n2 + n3 + n4 + n5 + n6 + n7);

	}

	static void m15() {
		System.out.println("千克            磅");
		for (int i = 1; i < 200; i = i + 2) {
			System.out.printf("%-3d              %5.1f\n", i, i * 2.2);

		}

	}

	static void m16() {
		System.out.println("英里            千米");
		for (int i = 1; i < 11; i++) {

			System.out.printf("%d                    %6.3f\n", i, i * 1.609);

		}

	}

	static void m17() {
		System.out.println("英里            千米            千米            英里");

		for (int i = 1, j = 20; i < 11; i++, j = j + 5) {
			System.out.printf("%d                    %.3f            %d            %.3f\n", i, i * 1.609, j, j / 1.609);
		}

	}

	static void m18() {
		int n = 0;
		System.out.print("请输入学生个数:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if (n <= 0) {
			System.out.print("输入有误，退出程序！");
			System.exit(1);
		}
		in.nextLine();
		String[] a = new String[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("请输入学生姓名:");
			a[i] = in.nextLine();
			System.out.print("请输入学生的分数:");
			b[i] = in.nextInt();
			in.nextLine();
			System.out.println();
		}
		int max = b[0], index = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];
				index = i;
			}
		}
		System.out.print("得分最高的同学是  " + a[index]);
	}

	static void m19() {
		int n = 0;
		System.out.print("请输入学生个数:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if (n <= 0) {
			System.out.print("输入有误，退出程序！");
			System.exit(1);
		}
		in.nextLine();
		String[] a = new String[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("请输入学生姓名:");
			a[i] = in.nextLine();
			System.out.print("请输入学生的分数:");
			b[i] = in.nextInt();
			in.nextLine();
			System.out.println();
		}
		int t;
		String t1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (b[j] > b[j + 1]) {
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;

					t1 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t1;
				}
			}

		}
		System.out.print("得分最高的同学是  " + a[n - 1] + "  得分第二高的学生是 " + a[n - 2]);

	}

	static void m20() {
		int a = 1;
		for (char i = '!'; i <= '~'; i++) {
			System.out.print(i + " ");
			if (a % 10 == 0) {
				System.out.println();
			}
			a++;
		}

	}

	static int m21_1(int n1) {

		for (int i = 2; i <= n1; i++) {
			if (n1 % i == 0) {
				System.out.print(i + "  ");
				n1 = n1 / i;
				return n1;
			}
		}
		return 1;
	}

	static void m21() {
		int n1 = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		n1 = in.nextInt();
		while (n1 != 1) {
			n1 = m21_1(n1);

		}

	}

	static void m22() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print('\t');
			}
			for (int j = 0; j <= i; j++) {
//				System.out.print((int) Math.pow(2, j) + "  ");
				System.out.printf("%4d\t", (int) Math.pow(2, j));

			}
			for (int j = i - 1; j >= 0; j--) {
				System.out.printf("%4d\t", (int) Math.pow(2, j));
			}
			System.out.println();
		}

	}

	static void m23() {

	}

	static void m24() {
		double sum = 0;
		for (int i = 1; i <= 49; i++) {
			sum += ((i * 2 + 1 - 2) * 1.0) / (i * 2 + 1);
		}
		System.out.print(sum);

	}

	static void m25() {
//		System.out.print(Math.pow(2, 2));
		double sum = 0;
		for (int i = 10000; i <= 100000; i = i + 10000) {
			for (int j = 1; j <= i; j++) {
				sum += Math.pow(-1, j + 1) / (2 * j - 1);
			}
			System.out.println("i=" + i + "时,pi=" + 4 * sum);
			sum = 0;
		}

	}

	static void m26() {
//		System.out.print((33 + 28 + 31) % 7);
		System.out.print("请输入年：");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		System.out.print("请输入该年的星期数0~6:");
		int n2 = in.nextInt();
		String[] str = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int[] n = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 冬是11月，腊是12月
		String[] date = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		for (int i = 0; i < 12; i++) {
			int n3 = 0;
			for (int j = 0; j < i; j++) {
				n3 += n[j];
			}
			n3 = (n3 + n2) % 7;
			System.out.print(date[i] + " " + 1 + ", " + n1 + " is " + str[n3] + '\n');
			n3 = 0;
		}
	}

	static void m27() {
		System.out.print("请输入年：");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		System.out.print("请输入该年的星期数0~6:");
		int n2 = in.nextInt();
		String[] str = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int[] n = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 冬是11月，腊是12月
		String[] date = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		if ((n1 % 100 == 0) || ((n1 % 4 == 0) && ((n1 % 100) != 0))) {
			n[1] += 1;
		}
		for (int i = 0; i < 12; i++) {
			int n3 = 0;
			for (int j = 0; j < i; j++) {
				n3 += n[j];
			}
			n3 = (n3 + n2) % 7;
//			System.out.print(date[i] + " " + 1 + ", " + n1 + " is " + str[n3] + '\n');
			System.out.print('\t' + date[i] + " " + n1);
			System.out.print("________");
			System.out.print(
					"Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" + "  " + "Thu" + "  " + "Fri" + "  " + "Sat");
			for (int j = 0; j < n[j]; j++) {
				int b = j + 1;
				for (int q = 0; q < n3; q++) {

				}
			}
			n3 = 0;
		}
	}

	static void m28() {
		int[] n = new int[100];
		for (int i = 6; i <= 10000; i++) {
			int sum = 0;
			int sum1 = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					n[sum] = j;
					sum++;
				}
			}
			/*
			 * System.out.print(sum + " " + '\n');
			 * 
			 * for (int j = 0; j < sum; j++) { System.out.print(n[j] + " "); }
			 */

			for (int j = 0; j < sum; j++) {
				sum1 += n[j];
			}
			if (sum1 == i) {
				System.out.print(i + "  ");
			}
			Arrays.fill(n, 0);

		}

	}

	static void m29() {
		Scanner in = new Scanner(System.in);

		int sum1 = 0, sum2 = 0;
		while (!((sum1 == 2) || (sum2 == 2))) {
			System.out.print("0代表石头，1代表剪刀，2代表布，请输入:");
			int n1 = in.nextInt();
			int n2 = (int) (Math.random() * 3);

			if (n1 == 0 && n2 == 1) {
				sum1++;
				System.out.println("本次人类赢");
			} else if (n1 == 1 && n2 == 2) {
				sum1++;
				System.out.println("本次人类赢");
			} else if (n1 == 3 && n2 == 0) {
				sum1++;
				System.out.println("本次人类赢");
			}

			else if (n2 == 0 && n1 == 1) {
				sum2++;
				System.out.println("本次电脑赢");
			} else if (n2 == 1 && n1 == 2) {
				sum2++;
				System.out.println("本次电脑赢");
			} else if (n2 == 3 && n1 == 0) {
				sum2++;
				System.out.println("本次电脑赢");
			} else {
				System.out.println("本次平局");
			}

		}
		if (sum1 == 2) {
			System.out.print("最后人类赢了");
		} else {
			System.out.print("最后电脑赢了");

		}
	}

	static void m30() {
		System.out.print("请输入一个十进制数:");
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int n3 = n;
		int[] n1 = new int[100];
		int n2 = 0;
		for (int i = 0; n > 0; i++) {
			n1[i] = n % 8;
			n = n / 8;
			n2 = i;
		}
		System.out.print(n3 + "对应的8进制数是 :");
		for (int i = n2; i >= 0; i--) {
			System.out.print(n1[i] + "");
		}
	}

	static void m31() {
		System.out.print("要赚30000$你必须要达到的销售额:" + ((25000 - 5000 * 0.08 - 5000 * 0.1) / 0.12 + 10000) + "$");

	}

	static void m32() {
		int sum1 = 0;
		for (int i = 0; i < 10000; i++) {
			if ((int) (Math.random() * 2) == 0) {
				sum1++;
			}
		}
		System.out.print("正面出现的次数为:" + sum1 + ",  反面出现的次数为:" + (10000 - sum1));
	}

	static void m33() {
		int[] n = new int[100];
		Scanner in = new Scanner(System.in);
		int n1;
		System.out.print("任意输入多个数字以0截止:");
		n1 = in.nextInt();
		int i = 0;
		while (n1 != 0) {
			n[i] = n1;
			n1 = in.nextInt();
			i++;

		}
		int max = n[0], count = 0;
		for (int j = 0; j < i; j++) {
			if (n[j] == max) {
				count++;
			}
			if (n[j] > max) {
				max = n[j];
				count = 1;
			}
		}
		System.out.print("最大值" + max + "出现的次数:" + count);

	}

	static void m34() {
		double[] n = new double[10];
		double[] n1 = new double[10];
		Scanner in = new Scanner(System.in);
		System.out.print("请输入10个数字：");
		double sum1 = 0, sum2 = 0;
		for (int i = 0; i < 10; i++) {
			n[i] = in.nextDouble();
			n1[i] = n[i] * n[i];
			sum1 += n[i];
			sum2 += n1[i];
		}
		double mean;
		mean = sum1 / 10;
		double st;
		st = Math.sqrt((sum2 - sum1 * sum1 / 10) / 9);
		System.out.println("The mean is " + mean);
		System.out.print("The standard deviation is " + st);
	}

	static void m35() {
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string:");
		String n;
		Scanner in = new Scanner(System.in);
		n = in.nextLine();

		Pattern zi = Pattern.compile("\\d{12}");
		Matcher a = zi.matcher(n);
		if (!a.matches()) {
			System.out.print(n + " is an invalid input");
			System.exit(0);
		}

		long n1 = Long.parseLong(n);

		long[] n2 = new long[12]; //
//		System.out.print(n1);

		for (int i = 0; n1 > 0; i++) {
			n2[i] = n1 % 10;
			n1 = n1 / 10;

		}
//		System.out.print(Arrays.toString(n2));

		long d = 10 - (n2[11] + 3 * n2[10] + n2[9] + 3 * n2[8] + n2[7] + 3 * n2[6] + n2[5] + 3 * n2[4] + n2[3]
				+ 3 * n2[2] + n2[1] + 3 * n2[0]) % 10;
		if (d == 10) {
			d = 0;
		}
		System.out.print("The ISBN-13 number is " + n + d);

	}

	static void m36() {
		String n1;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入第一个字符串：");
		n1 = in.nextLine();
		char[] n2 = n1.toCharArray();
//		System.out.print(Arrays.toString(n2));
		String z1;
		System.out.print("请输入第二个字符串：");
		z1 = in.nextLine();
		char[] z2 = z1.toCharArray();
		if (z2[0] != n2[0]) {
			System.out.print("他们没有相同前缀");
			System.exit(0);
		}
		System.out.print("他们的相同前缀是：");
		for (int i = 0; i < z2.length; i++) {

			if (n2[i] == z2[i]) {
				System.out.print(n2[i]);
			}
			if (n2[i] != z2[i]) {
				System.exit(0);
			}
		}
	}
}
