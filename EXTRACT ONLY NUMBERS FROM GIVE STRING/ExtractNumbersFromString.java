class ExtractNumbersFromString
{
	public static void main(String args[])
	{
		String str="hello123 iam sunil 2rh 15cs024";
		str=str.replaceAll("[^\\d]"," ");//logic of extracting digits;
		str=str.trim();//triming white spaces of left of str;
		str=str.replaceAll(" ","");//replacing white spacing by removing;
		System.out.println(str);
	}
}