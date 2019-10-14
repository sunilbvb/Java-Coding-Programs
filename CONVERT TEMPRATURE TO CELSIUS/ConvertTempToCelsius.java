import java.util.*;
class ConvertTempToCelsius
{
	public static void main(String args[])
	{
		float temp;
		System.out.println("Enter temprature to convert celsius");
		Scanner scanner =new Scanner(System.in);
		temp=scanner.nextFloat();
		double celsius=((temp-32)*5)/9;
		System.out.println("celsius is "+celsius);
	}
}