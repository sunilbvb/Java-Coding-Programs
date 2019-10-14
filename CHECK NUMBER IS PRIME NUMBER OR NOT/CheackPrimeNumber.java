import java.util.*;
class CheackPrimeNumber
{
	public static void main(String args[])
	{
		System.out.println("Enter number");
		Scanner scanner=new Scanner(System.in);
		boolean prime=false;
		int number=scanner.nextInt();	
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{	
				prime=false;	
				break;
			}
			else
			{
				prime=true;
			}
		}	
			if(prime)
			{
				System.out.println("Given number is Prime number");
			}
			else
			{
				System.out.println("Given number is not a Prime number");
			}
	}
}