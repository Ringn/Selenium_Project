package logical_programs;

public class Prime_Number2 {
	public static void main(String[] args) 
	{
		int a=0;
		for(int i=1;i<=100;i++)
		{
			int count=0;
			
			for(int j=1;j<=100;j++)
			{
				if(i%j==0)
				{
					count++;
				}
					
			}
			
			if(count==2)
			{
				a++;
				System.out.println(i);
			}
			
		}
		
		System.out.println("total prime numbers between 1 to 100: "+a);
		
		
	}

}
