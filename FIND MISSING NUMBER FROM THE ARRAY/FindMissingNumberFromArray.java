class FindMissingNumberFromArray
{
	public static void main(String args[])
	{
		int a[]={3,4,5,6,7,8,9,11};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=a[++i]-1)
			{
				System.out.println(a[i]-1);
			}
		}
	}
}