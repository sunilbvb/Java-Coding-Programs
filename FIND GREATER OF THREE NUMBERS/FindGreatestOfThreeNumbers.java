class FindGreatestOfThreeNumbers
{
	public static void main(String args[])
	{
			int num1=10;
			int num2=20;
			int num3=30;
			findGreater(num1,num2,num3);
	}
	static void findGreater(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.print(a);
		}
		else if(b>a && b>c)
		{
			System.out.print(b);
		}
		else
		{
			System.out.print(c);
		}
	}
}