package logical_programs;

public class Convert_First_LetterOfString_Uppercase {
	public static void main(String[] args) 
	{
		String str="ashvaghosg deepak ringne";
		String[] arr = str.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org = arr[i];
			
			String org2 = org.substring(0,1).toUpperCase()+org.substring(1);
			System.out.println(org2);
		}
		
		
	}

}
