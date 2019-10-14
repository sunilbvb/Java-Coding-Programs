import java.util.*;
class ReverseTheString
{
	public static void main(String args[])
	{
		System.out.println("Enter the string");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		char ch[]=str.toCharArray();
		int n=ch.length;
		String reverse=" ";
		for(int i=n-1;i>=0;i--)
		{
			reverse=reverse+ch[i];
		}
		System.out.println(reverse);
	}
}