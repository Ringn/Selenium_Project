package logical_programs;

public class Even_NumbersBetween_1To_100 {
	
	public static void main(String[] args)
	{
		
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.println(i);
			}
			
		}
		System.out.println("even numbers: "+count);
		
		
	}

}
