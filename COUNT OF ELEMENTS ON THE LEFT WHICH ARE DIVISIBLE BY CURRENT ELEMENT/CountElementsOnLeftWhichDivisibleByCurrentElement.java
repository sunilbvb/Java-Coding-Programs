class CountElementsOnLeftWhichDivisibleByCurrentElement
{
	public static void main(String args[])
	{
		int a[]={8,1,28,4,2,6,7};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(a[i-j]%a[i]==0)
				{
					count=count+1;
				}
			}
			System.out.print(count+"\t");
		}
	}
}