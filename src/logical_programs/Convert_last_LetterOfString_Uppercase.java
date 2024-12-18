package logical_programs;

public class Convert_last_LetterOfString_Uppercase {
	public static void main(String[] args) 
	{
		String str="ashvaghosh deepak ringne";
		String[] arr = str.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org = arr[i];
			
			String org2 = org.substring(0,org.length()-1)+org.substring((org.length()-1)).toUpperCase();
			System.out.println(org2);
		}
		
		
	}

}
