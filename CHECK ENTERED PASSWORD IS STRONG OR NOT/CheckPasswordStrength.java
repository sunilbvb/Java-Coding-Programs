import java.util.*;
class CheckPasswordStrength
{
	public static void main(String args[])
	{
		System.out.println("Enter Password");
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		int n=password.length();
		int digit=0;
		int lowerCase=0;
		int upperCase=0;
			for(int i=0;i<n;i++)
			{
				if(Character.isUpperCase(password.charAt(i)))
				{
					upperCase=upperCase+1;
				}
				if(Character.isLowerCase(password.charAt(i)))
				{
					lowerCase=lowerCase+1;
				}
				if(Character.isDigit(password.charAt(i)))
				{
					digit=digit+1;
				}
			}
			CheckPassword(n,lowerCase,upperCase,digit);
		}
static void CheckPassword(int n,int lowerCase,int upperCase,int digit)
	{
		if(n>=7)
		{
			if(upperCase>=1 && lowerCase>=1 && digit>=1)
			{	
				System.out.println("Password is Strong");
			}
			else
			{
				System.out.println("Password is Weak");
			}
		}
			else
			{
				System.out.println("Password is small cannot accept");
			}
	}
}
