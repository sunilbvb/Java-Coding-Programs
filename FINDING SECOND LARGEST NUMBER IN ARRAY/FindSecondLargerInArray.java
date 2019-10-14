class FindSecondLargerInArray
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,10,20,30,25};
		int seclarge=a[0];
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				seclarge=large;
				large=a[i];
			}
			else if (a[i]>seclarge)
			{
				seclarge=a[i];
			}
		}
		System.out.println("Second largest number in array is "+seclarge);
	}
}