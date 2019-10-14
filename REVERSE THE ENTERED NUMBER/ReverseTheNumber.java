import java.util.*;
class ReverseTheNumber
{
	public static void main(String args[])
	{
		System.out.println("Enter the Numbers");
		Scanner sc=new Scanner(System.in);
		int numbers=sc.nextInt();
		int rev=0;
		while(numbers>0)
		{
			rev=rev*10+numbers%10;
			numbers=numbers/10;
		}
		System.out.println(rev);
	}
}