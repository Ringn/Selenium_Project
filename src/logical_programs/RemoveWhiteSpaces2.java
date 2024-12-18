package logical_programs;

public class RemoveWhiteSpaces2 {
	public static void main(String[] args) 
	{
		String str="ash va gh osh";
		String str2="";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			
			if(ch!=' ')
			{
				str2=str2+ch;
			}
		}
		System.out.println(str2);
		
	}

}
