package firstcode;

import java.util.Arrays;
import java.util.Scanner;

public class ShiYan3 {
	public static void main(String[] args) {
		m18();
//		System.out.print(sort("fsafsa"));
	}

	static void m1() {
		String n1;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入您的密码：");
		n1 = in.nextLine();
		int sum1 = 0;
		char n2;
		if (n1.length() < 8) {
			System.out.print("输入有误，退出程序");
			System.exit(0);
		}
		for (int i = 0; i < n1.length(); i++) {
			n2 = n1.charAt(i);
			if (Character.isDigit(n2)) {
				sum1++;
			}
			if (Character.isLetterOrDigit(n2)) {

			} else {
				System.out.print("输入有误，退出程序");
				System.exit(0);
			}

		}

	}

	public static double sqrt(long n) {
		double lastGuess = 1;
		double nextGuess;
		nextGuess = (lastGuess + n / lastGuess) / 2;
		while ((nextGuess - lastGuess) >= 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;

		}
		return nextGuess;
	}

	static void m2() {
		System.out.print("输入你要计算的平方根:");
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		double r = sqrt(n);
		System.out.print(n + "的平方根是:" + r);

	}

	static boolean issu(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

	static int getfan(int[] n1, int n4) {

		int n5 = 0;
		for (int b = 0; b <= (n4 + 1); b++) {
			n5 += (int) Math.pow(10, n4 - b) * n1[b];

		}
		return n5;
	}

	static void m3() {
		int sum = 0, t, n3, n4 = 0;
		int fan;
		int[] n1 = new int[100];
		for (int i = 10; sum < 100; i++) {// i
			n3 = i;
			if (n3 % 10 == 0) {
				continue;
			}
			for (int j = 0; n3 > 0; j++) {

				t = n3 % 10;
				n1[j] = t;
				n3 = n3 / 10;
				n4 = j;
			}

//			System.out.print(n1.toString());
//			System.out.print(Arrays.toString(n1) + '\n');
			fan = getfan(n1, n4);
//			System.out.print(fan + " ");
			if (issu(fan) && issu(i) && (fan != i)) {
				System.out.print(i + "  ");
				sum++;
				if ((sum % 10 == 0) && (sum > 0)) {// 这里很神奇，放在if内和if隔得行数不同
					System.out.print('\n');
				}
			}

			Arrays.fill(n1, 0);
//			System.out.print(n4+'\n');

//		n5+=n4;
//			System.out.print(n5 + "  " + i + '\n');
			/*
			 * sum++; if(issu(i)&&issu(n5)){ System.out.print(i+"   "); sum++; }
			 * 
			 * if(sum%10==0){
			 * 
			 * System.out.println(); }
			 * 
			 * }
			 */
//		System.out.print(issu(8));

		}
	}

	static void m7() {
		int[] n = new int[10];
		int[] n1 = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.print("输入十个数字：");
		for (int i = 0; i < 10; i++) {
			n[i] = in.nextInt();
		}
		n1[0] = n[0];
		int count = 1, count1 = 0;
		for (int i = 1; i < n.length; i++) {
			for (int j = 0; j < count; j++) {
				if (n[i] == n1[j]) {
					break;
				}
				count1 = j;
			}
			if (count1 == (count - 1)) {
				n1[count] = n[i];
				count++;
			}
		}
		/*
		 * for (int i = 0; i < count; i++) {
		 * 
		 * }
		 */
		System.out.println("只出现一次的数字有：" + count);
		System.out.print("这些数字分别是：");
		for (int i = 0; i < count; i++) {
			System.out.print(n1[i] + " ");
		}

	}

	public static int getRandom(int... numbers) {
		int count = 0;
		while (true) {
			int n1 = (int) (Math.random() * 54) + 1;
			for (int e : numbers) {
				if (e == n1) {
					count++;
				}

			}
			if (count == 0) {
				return n1;
			}

		}

	}

	static int[] f = new int[4];// 存储四张牌
	static int Sum = 0, Count = 0;

	// 1.洗牌程序和随机取牌程序

	static void XiPai()

	{

		int allCard[] = new int[52];

		String[] card = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		String[] suits = { "黑桃", "红心", "梅花", "方块" };

		for (int i = 0; i < allCard.length; i++)

			allCard[i] = i;

		for (int i = 0; i < allCard.length; i++)// 随机交换

		{

			int index = (int) (Math.random() * allCard.length);

			int temp = allCard[i];

			allCard[i] = allCard[index];

			allCard[index] = temp;

		}

		System.out.println("正在洗牌.....");

		System.out.println("------------------");

		for (int i = 0; i < 4; i++)// 取四张牌

		{

			String suit = suits[allCard[i] / 13];

			String poker = card[allCard[i] % 13];

			f[i] = allCard[i] % 13 + 1;

			System.out.println("取到的第" + (i + 1) + "张牌为:" + suit + "" + poker);

			Sum += f[i];

		}

		System.out.println("所取的四张牌之和为:" + Sum);

		System.out.println("------------------");

		Sum = 0;

	}

	// 判断所取4张牌之和是否为24;

	static boolean JudgeSumIs24() {

		if (f[0] + f[1] + f[2] + f[3] == 24) {

			System.out.printf("所以和为24的洗牌次数是%d\n", Count + 1);

			System.out.println("*********************");

			return true;

		}

		else {

			Count++;

			System.out.printf("已经洗牌%6d次\n", Count);

			System.out.println("*********************");

			return false;

		}

	}

	public static void m18() {
		while (true) {

			XiPai();
			if (JudgeSumIs24()) {
				break;
			} else {
				continue;
			}

		}

	}

	public static boolean isConsecutiveFour(int[] values) {
		int count = 1;
		for (int i = 0; i < values.length - 1; i++) {
			count = 1;
			for (int j = i + 1; j < values.length; j++) {
				if (values[j] == values[i]) {
					count++;
				} else {
					break;
				}
				if (count == 4) {
					System.out.print(count);
					return true;
				}
			}

		}

		return false;

	}

	static void m19() {
		System.out.println("输入数字的个数：");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] n1 = new int[n];
		for (int i = 0; i < n; i++) {
			n1[i] = in.nextInt();
		}
		if (isConsecutiveFour(n1)) {
			System.out.print("数组含有连续的四个数");

		} else {
			System.out.print("数组没有连续的四个数");
			;
		}
	}

	public static String sort(String s) {
		char[] n = s.toCharArray();
		char n1;
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 0; j < n.length - 1 - i; j++) {
				if (n[j] > n[j + 1]) {
					n1 = n[j];
					n[j] = n[j + 1];
					n[j + 1] = n1;
				}
			}
		}
		s = String.copyValueOf(n);
		return s;

	}

	static void m22() {
		String[] words = { "write", "apple", "program", "beat", "cold" };
		Scanner in = new Scanner(System.in);
		char choose = 'y';
		while (choose == 'y') {
			int ran;
			ran = (int) (Math.random() * 6);

			char[] s = new char[words[ran].length()];
			char[] s1 = words[ran].toCharArray();
			for (int i = 0; i < s.length; i++) {
				s[i] = '*';
			}
			String n2 = words[ran];
			int miss = 0;
			String n1;
//			while ((n1 = String.copyValueOf(s)) != words[ran]) {错
//			String.copyValueOf(s)!=n2    错
			while (!String.copyValueOf(s).equals(n2)) {
				int sum = 0;
				char n;
				System.out.print("(Guess) Enter a letter in word " + String.copyValueOf(s) + " > ");
				n = in.nextLine().charAt(0);
				for (int i = 0; i < s.length; i++) {
					if (n == s[i]) {
						System.out.println("     " + n + " is already in the word");
						continue;
					}
				}
				for (int i = 0; i < s1.length; i++) {
					if (n == s1[i]) {
						s[i] = n;
						sum++;
					}
				}
				if (sum == 0) {
					System.out.println("     " + n + " is not in the word");
					miss++;
					continue;
				}

			}
			System.out.print("The word is " + String.copyValueOf(s1) + ". You miss " + miss + " time ");
			System.out.print("do you want to guess another word? Enter y or n>");
			choose = in.nextLine().charAt(0);
			if (choose == 'n') {
				System.out.print("good bye!");
				System.exit(0);
			}
		}

	}

	public static double sumMajoarDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (i == j) {
					sum += m[i][j];
				}
				/*
				 * if(j==(m[0].length-1-i)){
				 * 
				 * 
				 * 1 2 3 4.0 5 6.5 7 8 9 10 11 12 13 14 15 16 sum+=m[i][j];
				 * 
				 * }
				 */
			}
		}
		return sum;

	}

	static void m24() {
		double[][] m = new double[4][4];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a 4 by 4 matrix row by row:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = in.nextDouble();

			}
		}
		System.out.println("sum of the elements in the major diagonal is " + sumMajoarDiagonal(m));
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double c[][] = new double[3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[0][i] + "  ");
		}
		System.out.print("    ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[0][i] + "  ");
		}
		System.out.print("   ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[0][i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[1][i] + "  ");
		}
		System.out.print(" + ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[1][i] + "  ");
		}
		System.out.print(" =  ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[1][i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[2][i] + "  ");
		}
		System.out.print("    ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[2][i] + "  ");
		}
		System.out.print("    ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[2][i] + " ");
		}
		return a;
	}

	/*
	 * 1 2 3 4 5 6 7 8 9 Enter matrix2:0 2 4 1 4.5 2.2 1.1 4.3 5.2
	 */
	static void m26() {
		System.out.print("Enter matrix1:");
		double a[][] = new double[3][3];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = in.nextDouble();
			}
		}

		System.out.print("Enter matrix2:");
		double b[][] = new double[3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = in.nextDouble();
			}
		}
		addMatrix(a, b);
	}

}
