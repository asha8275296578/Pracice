import java.util.Scanner;
public class Variablechk
{
	public static void main(String []args)
	{
		int a;
		float f;
		char c='a';
		double d;
		short s;
		long l;
		boolean b= true;
		String str="i am happy ";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for Integer");
		a=sc.nextInt();
		System.out.println("enter the value for float");
		f=sc.nextFloat();
		System.out.println("enter the value for double");
		d=sc.nextDouble();
		System.out.println("enter the value for short");
		s=sc.nextShort();
		System.out.println("enter the value for long");
		l=sc.nextLong();
		System.out.println("Integer:"+a);
		System.out.println("float:"+f);
		System.out.println("char:"+c);
		System.out.println("double:"+d);
		System.out.println("short:"+s);
		System.out.println("long:"+l);
		System.out.println("boolean:"+b);
		System.out.println("String: "+str);
		
		
	}
	
	
	

}
