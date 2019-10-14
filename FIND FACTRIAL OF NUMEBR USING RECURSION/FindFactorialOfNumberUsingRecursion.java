class FindFactorialOfNumberUsingRecursion
{
	static int findFactorial(int n)
	{
		if(n==0)
			return 1;
		else
			return n*findFactorial(n-1);
	}
	public static void main(String args[])
	{
		int factorial=1;
		int number=5;
		factorial=findFactorial(number);
		System.out.println(factorial);
	}
}