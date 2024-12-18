package logical_programs;

public class AddTwo_Numbers_WithoutAdditionOperator2 
{
	public static void main(String[] args) 
	{
		System.out.println(add(4,5));
		
	}
	
	public static int add(int a,int b) 
	{
		for(int i=1;i<=a;i++)
		{
			b++;
		}
		return b;
		
	}

}


