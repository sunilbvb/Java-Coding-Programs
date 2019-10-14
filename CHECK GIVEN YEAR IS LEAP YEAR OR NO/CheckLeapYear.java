import java.util.*;  
class CheckLeapYear
{
	public static void main(String args[])
	{
		System.out.println("Enter Year");
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		if(year%4==0)
		{
			System.out.println("Given Year is a Leap Year");
		}
		else
		{
			System.out.println("Given Year is not a Leap Year");
		}
	}
}