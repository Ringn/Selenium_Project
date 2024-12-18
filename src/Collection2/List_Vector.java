package Collection2;

import java.util.Enumeration;
import java.util.Vector;

public class List_Vector 
{

	public static void main(String[] args) 
	{
		//inherits features from list
		
		Vector v=new Vector();
		
		v.add(101);
		v.add("ashvaghosh");
		v.add("A");
		
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		//here we can use all type of curser
		
		
		
	}
}
