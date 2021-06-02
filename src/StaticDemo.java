
public class StaticDemo
{
	static
	{
		System.out.println("static block executed");
		
	}
	private static  int a=10;
	private static int b=20;
	private static int c;
	

	
	static void add()
	{
		c=a+b;
		System.out.println("the addition is "+c);
	}
	

}
