package logical_programs;

public class ReverseString3 {
	//ym name si ashvaghosh
	public static void main(String[] args) 
	{
		String s1="my name is ashvaghosh";
		
		
		String[] arr = s1.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org = arr[i];
			
			if(i%2==0)
			{
				for(int j=org.length()-1;j>=0;j--)
				{
					System.out.print(org.charAt(j));
				}
				System.out.print(" ");
			}

			if(i%2!=0)
			{
				for(int j=0;j<=org.length()-1;j++)
				{
					System.out.print(org.charAt(j));
				}
				System.out.print(" ");
			}
			
		}
		
		
		
	}

}

