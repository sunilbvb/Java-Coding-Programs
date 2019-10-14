import java.util.*;
class InsertElementAtPositionInArary
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,6,7,8,9,10};
		int pos=5;
		int x=5;
		int n=arr.length;
		System.out.println("Initial array" +Arrays.toString(arr));
		int newarr[]=new int[n+1];
		//char[] ch=arr.toCharArray();
		
		for(int i=0;i<n+1;i++)
		{
			if(i<pos-1)
			{
				newarr[i]=arr[i];		
			}	
			else if(i==pos-1)
			{
				newarr[i]=x;
			}
			else
			{
				newarr[i]=arr[i-1];
			}
		}
		System.out.println("Initial array" +Arrays.toString(newarr));
	}
}