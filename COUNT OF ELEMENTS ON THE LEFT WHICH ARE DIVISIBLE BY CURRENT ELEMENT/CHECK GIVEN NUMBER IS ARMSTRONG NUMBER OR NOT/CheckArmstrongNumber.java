class CheckArmstrongNumber
{
	public static void main(String args[])
	{
		int number=153;
		FindArm(number);
	}
		static void FindArm(int n)
		{
		int rem=0;
		int cube=0;
		int number=n;
		while(n>0)
		{
		rem=n%10;
		n=n/10;
		cube=cube+(rem*rem*rem);
		}
		if(cube==number)
		{
		System.out.println("Given number is Armstong number");
		}
		else
		{
		System.out.println("Given number is not Armstong number");
		}
	}
}