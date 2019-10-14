import java.util.*;
class CheckEvenOddNumber
{
	public static void main(String args[])
	{
		System.out.println("Enter number");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int result=(number/2)*2;
		if(result==number)	
		{
			System.out.println("Given Numebr is Even");
		}
		else
		{
			System.out.println("Given Numebr is odd");
		}

	}
}