package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class VerifyEachOccuranceOf_Charecter_In_String3 
{
	public static void main(String[] args)
	{
		String str="ashvaghosh deepak is name is ashvaghosh deepak is name my";
		
		String[] arr = str.split(" ");
		
		HashMap<String,Integer> hm=new HashMap();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String s1 = arr[i];
			
			if(hm.containsKey(s1))
			{
				hm.put(s1, hm.get(s1)+1);
			}
			else
			{
				hm.put(s1, 1);
			}
			
		}
		System.out.println(hm.get("my"));
		System.out.println("---------");

		Set<String> allkey = hm.keySet();
		System.out.println("all words with occuramce");
		for(String key:allkey)
		{
			System.out.println(key+"-"+hm.get(key));
		}
		System.out.println("---------");
		System.out.println("duplictaes words");
		for(String key:allkey)
		{
			if(hm.get(key)>1)
			{
				System.out.println(key+"-"+hm.get(key));

			}
			
		}
		
		
		
		
	}

}
