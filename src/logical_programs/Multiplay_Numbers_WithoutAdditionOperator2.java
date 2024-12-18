package logical_programs;

public class Multiplay_Numbers_WithoutAdditionOperator2 
{
	static int sum=0;
	public static void main(String[] args) 
	{
		System.out.println(multi(4,5));
		
	}
	
	public static int multi(int a,int b) 
	{
		for(int i=1;i<=a;i++)
		{
			sum=sum+b;
		}
		return sum;
		
	}

}


