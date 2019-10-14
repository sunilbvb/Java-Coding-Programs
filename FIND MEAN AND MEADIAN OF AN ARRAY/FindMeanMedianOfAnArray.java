import java.util.*;
class FindMeanMedianOfAnArray
{
	public static void main(String args[])
	{
		int a[]={1,5,9,6,4,3,8,7};
		int n=a.length;
		int findmean=FindMean(n,a);
		int findmedian=FindMedian(n,a);
		System.out.println("Mean is "+findmean);
		System.out.println("Mean is "+findmedian);
	}
	static int FindMean(int n,int a[])
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	static int FindMedian(int n,int a[])
	{
		Arrays.sort(a);
		if(n%2!=0)
		return  a[n/2];	
		return a[(n-2)/2]+a[n/2]/2;
	}
}
