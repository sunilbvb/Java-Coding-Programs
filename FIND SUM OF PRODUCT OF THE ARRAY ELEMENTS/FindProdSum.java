class FindProdSum
{
	public static void main(String args[])
	{
		int a[]={1,3,5};
		int product =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				product=product+a[i]*a[j];
			}			
		}
		System.out.println(product);
	}
}