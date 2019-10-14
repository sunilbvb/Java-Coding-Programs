import java.util.*;
class SortStringDescendingOrder
	{
		public static void main(String args[])
		{
			char []s="geeksforgeeks".toCharArray();
			descorder(s);
			System.out.println(String.valueOf(s));
		}
		static void descorder(char[] s)
		{
			Arrays.sort(s);
			reverse(s);
		}
		static void reverse(char [] a )
		{
			int n=a.length;
			char t;
			for(int i=0;i<n/2;i++)
			{
				t=a[i];
				a[i]=a[n-i-1];
				a[n-i-1]=t;
			}
		}
	}