import java.util.*;
public class T0815{

	public static void main(String[] args){
	m6();
	}
	static  void m1(){
		double x0,y0,x1,y1;
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
		d = 6371.01*Math.acos(Math.sin(x0)*Math.sin(x1)+Math.cos(x0)*Math.cos(x1)*Math.cos(y0-y1));
				System.out.print("The distance between the two points is "+d);
	} //39.55 -116.25
	//Enter point 2 (latitude and longitude) in degrees:41.5 87.37
	static void m2(){
		double s1,s2;
		System.out.print("Enter the numbers of sides:");
		Scanner in = new Scanner(System.in); 
		s1=in.nextDouble();
		System.out.print("Enter the  side:");
		s2=in.nextDouble();
		double s3;
		s3 = s1*Math.pow(s2, 2)/(4*Math.tan(Math.PI/s1));
		System.out.print("The area of the polygom is "+s3);
	}
	static void m3(){
		
		
		
	}
	static void m4(){
		int n1;
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter an ASCLL code:");
		n1 = in.nextInt();
		char n2;
		n2 = (char)n1;
		System.out.print("The character for ASCLL code "+n1+" is "+n2);
	}
	static void m5(){
		System.out.print("Enter a character :");
		char n1;
		Scanner in = new Scanner(System.in); 
		int n2;
		n1=in.next().charAt(0);
		n2=(int)n1;
		System.out.print("The Unicode for character "+n1+" is "+n2);
	}
	static void m6(){
	System.out.print("Enter a hex character :");
	Scanner in = new Scanner(System.in); 

	String h;
	h = in.nextLine();	
	if(h.length()!=1){
		System.out.print("输入有误,你只能输入一位，退出程序");
		System.exit(1);
	}
	char ch=Character.toUpperCase(h.charAt(0));
	if(ch <= 'F'&&ch>= 'A'){
		int n1 = ch-'A'+10;
		
		
	}
	else if (Character.isDigit(ch)) {
		n1=(int)ch-48;
	}
	
	}
}

