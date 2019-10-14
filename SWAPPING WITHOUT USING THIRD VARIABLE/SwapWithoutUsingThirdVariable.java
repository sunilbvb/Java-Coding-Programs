import java.util.*;
class SwapWithoutUsingThirdVariable
{
	public static void main(String args[])
	{
		System.out.println("Enter x and y values");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("x= "+x+"\ny= "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping");
		System.out.println("x= "+x+"\ny= "+y);
	}
}