package logical_programs;

public class Finde_TotalNumberOf_Digits_Alaphets_Numbers {
	public static void main(String[] args) 
	{
		String str="---abc 12 @";
		
		int countLstter=0;
		int countDigit=0;
		int countWhiteSpaces=0;
		int countSpecialChar=0;
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char s1 = str.charAt(i);
			
			if(Character.isLetter(s1))
			{
				countLstter++;
				
			}
			else if(Character.isDigit(s1))
			{
				 countDigit++;
				
			}
			
			else if(Character.isWhitespace(s1))
			{
				countWhiteSpaces++;
				
			}
			else
			{
				countSpecialChar++;
				
			}
			 
			
		}
		
		System.out.println("letter_count: "+countLstter);
		System.out.println("digit_count: "+countDigit);
		System.out.println("spaces_count: "+countWhiteSpaces);
		System.out.println("SpecialChar: "+countSpecialChar);
	}

}
