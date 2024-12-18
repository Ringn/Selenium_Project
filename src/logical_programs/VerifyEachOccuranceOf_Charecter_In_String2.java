package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class VerifyEachOccuranceOf_Charecter_In_String2
{
	public static void main(String[] args) 
	{
		String str="ashvaghosh";
		
		HashMap<Character,Integer> hm=new HashMap();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
			}
			else
			{
				hm.put(ch,1);
			}
			
		}
		
		Set<Character> allkey = hm.keySet();
		//occurance of charecter
//		for(Character key:allkey)
//		{
//			System.out.println(key+"-"+hm.get(key));
//		}
		
		for(Character key:allkey)
		{
			if(hm.get(key)>1)
			{
				System.out.println(key+"-"+hm.get(key));

			}
		}
		
		
	}

}
