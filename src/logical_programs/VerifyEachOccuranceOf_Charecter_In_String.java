package logical_programs;

public class VerifyEachOccuranceOf_Charecter_In_String 
{
	public static void main(String[] args) 
	{
		String str="aaaaaaaaaaa";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			
			if(ch=='a')
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
