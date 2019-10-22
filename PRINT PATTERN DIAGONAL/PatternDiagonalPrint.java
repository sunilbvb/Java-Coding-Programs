/* Print pattern like this 
	0 1 1 1 1
	1 0 1 1 1
	1 1 0 1 1
	1 1 1 0 1
	1 1 1 1 0
*/
class PatternDiagonalPrint
{
	public static void main(String args[])
	{
		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<5 ;j++ )
			{
				if(i==j)
				{
				System.out.print("0 ");
				}
				else
				{
				System.out.print("1 ");
				}
			}
			System.out.println("");
		}
	}
}