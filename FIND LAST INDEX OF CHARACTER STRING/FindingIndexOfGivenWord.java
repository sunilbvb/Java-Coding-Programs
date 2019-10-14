class FindLastIdexOfCharacterString
{
	public static void main(String args[])
	{
		String str="SUNIL";
		char x='k';
		int i;
		int index=0;
		char ch[]=str.toCharArray();
		int n=ch.length;
		for(i=0;i<n-1;i++)
		{
			if(ch[i]==x);
			{
				index=i;
			}
		}
		System.out.println("The Character of last index "+(n-1)+ " is " +ch[n-1]);
		System.out.println("The index of Character " +x+ " is "+index);
	}
}
