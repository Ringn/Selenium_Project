package logical_programs;

public class Vowels_PrsentIn_String {
	public static void main(String[] args) 
	{
		String str="ashvaghosh";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				
				 count++;
			}
			
			
		}
		if(count>=1)
		{
			System.out.println("vowels is present");
			
		}
		else
		{
			System.out.println("vowels is not present");

		}
		
		
		
		
		
	}

}
