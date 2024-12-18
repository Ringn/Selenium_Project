package Collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class List_ArrayList {
	
	//we can store any number of null values
	//duplicate value is acceptable
	//order of insertion maintain
	//store data in index format
	@Test
	public void tc1() 
	{
		ArrayList a1=new ArrayList();
		
		a1.add(101);
		a1.add(101);
		a1.add("Ashvaghosh");
		a1.add("Deepak");
		a1.add("Ringne");
		a1.add(null);
		a1.add(null);
		a1.add('A');
		
		System.out.println(a1);//print all data
		
		System.out.println(a1.size());
		System.out.println(a1.get(0));
		System.out.println(a1.isEmpty());
		
		//update data
		a1.set(0,"saheb");
		System.out.println(a1);
		
		//add data in between array list
		a1.add(4,500);
		System.out.println(a1);

		//remove
		a1.remove(4);
		System.out.println(a1);
		
		//print data using for loop
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		
		//print data using for each loop
		for(Object s1:a1)
		{
			System.out.println(s1);
		}
		
		//using iterator curser
		
		Iterator itr=a1.iterator();
		System.out.println("-------iterator-------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
