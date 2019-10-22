class TripletsOfArrayWhoseSumIsZero
{
	public static void main(String args[])
	{
		int a[]={1,2,-3,-2,-1};
		int n=a.length;
		boolean found =false;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+i;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						
						found=true;
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
		if(found)
		{
			System.out.println("Triplets Found whose sum is zero");
		}
		else
		{
			System.out.println("not found ");
		}
	}
}