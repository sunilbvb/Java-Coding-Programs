class SumOfPositiveNumbersOnly
{
	public static void main(String args[])
	{
		int a[]={-1,5,-2,6,-7,8};
		int n=a.length; 
		int positiveSum=0;
		boolean found=false;
		for(int i=0;i<n;i++)
		{
			if(a[i]>0) //IF WANT ONLY SUM OF NEGATIVE NUMBER then make if(a[i]<0)
			{
			found =true;
			int count=a[i];
			positiveSum=positiveSum+count;
			}
		}
		if(found)
		{
		System.out.println(positiveSum);
		}
		else
		{
		System.out.println("positive numbers are not present");
		}
	}
}