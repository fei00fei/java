package ShiYan5;

public class ShiYan5 {
	public static void main(String[] args) {

		m3();

	}

	static void m1() {
		Time n = new Time();
		System.out.println(n.getHour() + " " + n.getMinute() + " " + n.getSecond());
		Time n1 = new Time(555550000);
		System.out.println(n1.getHour() + " " + n1.getMinute() + " " + n1.getSecond());
		System.out.print(10 * 60 * 60 * 1000 + 10 * 60 * 1000 + 10 * 1000);
	}

	static void m3() {
		Mylnteger r1 = new Mylnteger(5);
		System.out.println(r1.getValue());
		System.out.println(r1.isEven());
		System.out.println(r1.isOdd());
		System.out.println(r1.isPrime());
		System.out.println(Mylnteger.isEven(655));
		System.out.println(Mylnteger.isOdd(655));
		System.out.println(Mylnteger.isPrime(655));
		System.out.println(r1.equals(3));
		Mylnteger r2 = new Mylnteger(5);
		System.out.println(r1.equals(r2));
		char[] b1 = { '1', '2', '3' };
		System.out.println(Mylnteger.parseInt(b1));
		String b2 = "123";
		System.out.print(Mylnteger.parseInt(b2));
	}

}
