package logical_programs;

public class Reverse_String1 {
	public static void main(String[] args) 
	{
		//ashvaghosh is name my
		
		String str="my name is ashvaghosh";
		
		String[] arr = str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
