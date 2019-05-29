package firstcode;

public class ZhiZheng {
	public static void main(String[] args) {

		StringBuffer a = new StringBuffer();
		a.append("a");
		System.out.println(a.toString());

		StringBuffer b = a;
		b.append("b");
		System.out.println(a.toString());

	}
}
