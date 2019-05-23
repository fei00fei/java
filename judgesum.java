package firstcode;//有这条语句时，cmd的操作需要改变
import java.util.Scanner;//输入需要的包

public class judgesum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//input为对象 写的时候可以先加这条语句
		int num1,num2,result,getnum;
		num1=(int)(Math.random()*100);//int需要括号，仅仅只转换靠近他的数字
		num2=(int)(Math.random()*100);
		result=num1+num2;
		boolean judge=false;
		System.out.printf("请输入%d+%d的结果:",num1,num2);  // 格式化输入用printf
//		System.out.print("请输入num1+num2的结果:"+num1+num2);print和println一样都是用+来拼接输出
		getnum=input.nextInt();//input.next()可以输入字符串
		if(getnum==result) {
			System.out.println("恭喜你答对了");
			judge=true;
		}
		for(;!judge;) {
			System.out.print("抱歉你答错了，请重新输入:");
			getnum=input.nextInt();
			if(getnum==result) {
				System.out.println("恭喜你答对了");
				judge=true;
			}
		}
		input.close();//防止出现警告：没关闭
			
	}
	
}
