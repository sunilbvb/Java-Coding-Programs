class DuplicatesVowelsInTheString
{
	public static void main(String args[])
	{
		String str="hello world";
		String res=duplicateVowels(str);
		System.out.println(res);
	}
	static boolean isVowel(char ch)
	{
	return (ch=='a'||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' );
	}
	static String duplicateVowels(String str)
	{
		String res=" ";
		char  chc[]=str.toCharArray();
		int t=chc.length;
		for(int i=0;i<t;i++)
		{
			res+=chc[i];
			if(isVowel(chc[i]))
			res+=chc[i];
		}
		return res;
	}
}