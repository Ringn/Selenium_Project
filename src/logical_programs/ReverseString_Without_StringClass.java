package logical_programs;

public class ReverseString_Without_StringClass {
	public static void main(String[] args) 
	{
		String str="abcd";
		
//		StringBuffer s1=new StringBuffer(str);
//		System.out.println(str);
//		System.out.println(s1.reverse());
		
		StringBuilder s1=new StringBuilder(str);
		System.out.println(str);
		System.out.println(s1.reverse());
		
	}

}
