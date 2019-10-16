class FindSumOfPairsOfMaximumArray
{
	public static void main(String args[])
	{
		int a1[]={1,5,6,8,3};
		int a2[]={1,10,6,9,3};
		int max1=1;
		int max2=1;
		int n1=a1.length;
		int n2=a2.length;
		int j=1;
		for(int i=0;i<n1;i++)
		{
			if(a1[i]>a1[j])
			{
				j=i;
			}
			max1=a1[j];
		}
		for(int i=0;i<n2;i++)
		{
			if(a2[i]>a2[j])
			{
				j=i;
			}
			max2=a2[j];
		}
		System.out.println(max1+max2);
	}
}