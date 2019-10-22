/*Print Star Pattern like below
		*
	   **
	  ***
	 ****
	*****
	 ****
	  ***
	   **
	    * 
*/
class PrintStarPatten3
{
	public static void main(String args[])
	{
		int l=4; 
		for( int k=1;k<=5;k++)
		{
			for(int i=1;i<=l;i++)
			{
				System.out.print(" ");
			}
			l--;
			for(int j=0;j<k;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k=1;k<=5;k++)
		{	
			for(int i=1;i<=k;i++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>k;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
