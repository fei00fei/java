package ShiYan5;

public class Time {
	private static long hour, minute, second;

	public Time() {
		// TODO Auto-generated constructor stub
		long s1 = System.currentTimeMillis();
		second = s1 / 1000 % 60;
		minute = s1 / 1000 / 60 % 60;
		hour = 8 + (s1 / 1000 / 60 / 60 % 24);
	}

	Time(long n1) {
		long per1 = 60 * 60;
		long per2 = 60;

		hour = n1 / 1000 / per1;
		minute = (n1 - hour * 1000 * 60 * 60) / 1000 / per2;
		second = (n1 - hour * 1000 * 60 * 60 - minute * 60 * 1000) / 1000;

	}

	Time(long a1, long a2, long a3) {
		hour = a1;
		minute = a2;
		second = a3;

	}

	public static void setTime(long elapseTime) {
		hour = elapseTime / 1000 / 60 / 60;
		minute = (elapseTime - hour * 1000 * 60 * 60) / 1000 / 60;
		second = (elapseTime - hour * 1000 * 60 * 60 - minute * 60 * 1000) / 1000 / 60;

	}

	public static long getHour() {
		return hour;
	}

	public static long getMinute() {
		return minute;
	}

	public static long getSecond() {
		return second;
	}

}
