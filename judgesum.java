package firstcode;//���������ʱ��cmd�Ĳ�����Ҫ�ı�
import java.util.Scanner;//������Ҫ�İ�

public class judgesum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//inputΪ���� д��ʱ������ȼ��������
		int num1,num2,result,getnum;
		num1=(int)(Math.random()*100);//int��Ҫ���ţ�����ֻת��������������
		num2=(int)(Math.random()*100);
		result=num1+num2;
		boolean judge=false;
		System.out.printf("������%d+%d�Ľ��:",num1,num2);  // ��ʽ��������printf
//		System.out.print("������num1+num2�Ľ��:"+num1+num2);print��printlnһ��������+��ƴ�����
		getnum=input.nextInt();//input.next()���������ַ���
		if(getnum==result) {
			System.out.println("��ϲ������");
			judge=true;
		}
		for(;!judge;) {
			System.out.print("��Ǹ�����ˣ�����������:");
			getnum=input.nextInt();
			if(getnum==result) {
				System.out.println("��ϲ������");
				judge=true;
			}
		}
		input.close();//��ֹ���־��棺û�ر�
			
	}
	
}
