import java.util.*;
class FindLCMofTwoNumbersUsingRecursion
{
	public static void main(String args[])
	{
		int n1,n2,l;
		System.out.println("Enter number 1");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.println("Enter number 2");
		n2=sc.nextInt();
		if(n1>n2)
		{
			l=n1;
		}
			else
			l=n2;
			lcm(n1,n2,l);
		}
	
	static void lcm(int n1,int n2,int l)
	{
		if(l%n1==0 && l%n2==0)
		{
			System.out.println("LCM is "+l);
		}
		else
		{
			l++;
			lcm(n1,n2,l);
		}
	}
	}