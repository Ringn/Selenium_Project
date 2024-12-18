package logical_programs;

public class Reverse_String2 {
	public static void main(String[] args) 
	{
		//ym eman si hsohgavhsa
		
		String str="my name is ashvaghosh";
		
		String[] arr = str.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org = arr[i];
			
			for(int j=org.length()-1;j>=0;j--)
			{
				System.out.print(org.charAt(j));
				
			}
			System.out.print(" ");
		}
		
	}

}
