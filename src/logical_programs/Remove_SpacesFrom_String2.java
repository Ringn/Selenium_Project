package logical_programs;

public class Remove_SpacesFrom_String2 {
	
	public static void main(String[] args) 
	{
		
		String str="ab356cdef12";
		String digit="";
	    System.out.println(str);
	    
	    for(int i=0;i<=str.length()-1;i++)
	    {
	    	char ch = str.charAt(i);
	    	
	    	if(Character.isDigit(ch))
	    	{
	    		digit=digit+ch;
	    	}
	    	
	    }
	    
	    System.out.println(digit);
	}

}
