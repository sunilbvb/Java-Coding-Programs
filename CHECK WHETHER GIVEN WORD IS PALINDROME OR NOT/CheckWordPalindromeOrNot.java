class CheckWordPalindromeOrNot
{
	public static void main(String args[])
	{
		String str="Gadag";
		checkingPalindrome(str);
	}
		static void checkingPalindrome(String str)
		{
			String str2="";
			for(int i=str.length()-1;i>=0;i--)
			{
				str2=str2+str.charAt(i);		
			}
			if(str.equalsIgnoreCase(str2))
				System.out.println("Yes it is Palindrome");
			else
				System.out.println("No it is not Palindrome");
		}
}
