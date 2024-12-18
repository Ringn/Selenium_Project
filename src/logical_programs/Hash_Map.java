package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class Hash_Map {
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101,"bhushan");// to add
		hm.put(102,"Manav");//order of insertion is not maintained
		hm.put(103,"jaya");
		hm.put(104,"Deepak");
		hm.put(null, "ringne");//we can add one null key
		hm.put(105,null);
		hm.put(106,null);//we can add any number of null values
		System.out.println(hm);
		
		System.out.println(hm.get(102));//particular key value
		//verify specific key present or not
		System.out.println(hm.containsKey(104));
		//print all keys
		Set<Integer> allkey = hm.keySet();
		for(Integer key:allkey)
		{
			System.out.println(key);
		}
		
		//print all keys and values
				Set<Integer> allkey1 = hm.keySet();
				for(Integer keys:allkey1)
				{
					System.out.println(keys+":"+hm.get(keys));
				}
				
				
				//update specific key value
				hm.put(103,"jayshri");
				System.out.println(hm);
		
		
	}

}
