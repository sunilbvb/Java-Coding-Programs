class SwapUsingThirdVariable
{
	public static void main(String args[])
	{
		Integer i=new Integer(10);
		Integer j=new Integer(20);
		swap(i,j);
	}
	static void swap(Integer i,Integer j)
	{
		Integer temp=new Integer(i);
		i=j;
		j=temp;
		System.out.println("i=" + i + " j= " + j);
	}
}