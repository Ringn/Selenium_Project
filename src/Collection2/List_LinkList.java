package Collection2;

import java.util.Iterator;
import java.util.LinkedList;


public class List_LinkList {
	public static void main(String[] args) 
	{
		
		//inherits coman features from list
		
		LinkedList ll=new LinkedList<>();
		ll.add(101);
		ll.add("adringne");
		ll.add('A');
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
