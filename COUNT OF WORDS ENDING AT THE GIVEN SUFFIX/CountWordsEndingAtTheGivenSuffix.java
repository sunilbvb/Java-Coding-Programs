class CountWordsEndingAtTheGivenSuffix
{
	public static void main(String args[])
	{
		String str="geeksforgeeks for geeks only";
		String suff="ks";
		int cnt=0;
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(words[i].endsWith(suff))
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
