class FindSumOfPosiblePairsOfArray
{
	public static void main(String ars[])
	{
		int a[]={1,2,3};
		int sum=0;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum+=a[i]+a[j];
			}
		}
		System.out.println("Sum of Pairs of Array is "+sum);
	}
}
