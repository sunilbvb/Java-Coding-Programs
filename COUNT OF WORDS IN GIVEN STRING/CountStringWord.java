class CountOfStringWord
{
	public static void main(String args[])
	{
		String str="hello world";
		count(str);
	}
	static void count(String str)
	{
		char[] ch=str.toCharArray();
		int n=ch.length;
		
		for(int i=0;i<n;i++)
		{
			String s="";	
			while(i<n && ch[i]!=' ')
			{
				s=s+ch[i];
				i++;		
			}
			System.out.println(s+" : "+s.length());			
		}
	}
}