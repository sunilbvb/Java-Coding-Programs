import java.util.*;
class SmallestNumberDivideAllNumbersInArray
{
	public static void main(String args[])
	{
		int array[]={102,24,3,51,15};
		int n=array.length;
		Arrays.sort(array);
		int minmumArrayValue=array[0];
		findMinimumArrayValue(array,n,minmumArrayValue);
	}
	static void findMinimumArrayValue(int array[],int n,int minmumArrayValue)
	{
		boolean b=false;
		for (int i=0;i<n ;i++ )
		{
			if(array[i] % minmumArrayValue==0)
			{
				b=true;
			}
			else
			{
				b=false;
				break;
			}
		}
		if(b)	
		{
		System.out.println("Minimum Array value is "+minmumArrayValue+" that divides all the number in an Array");
		}
		else
		{
			System.out.println("Not Exist");			
		}
	}
}