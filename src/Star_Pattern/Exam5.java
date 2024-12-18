package Star_Pattern;

public class Exam5 {
	public static void main(String[] args) 
	{
		//*******
		//  ***
		//  ***
		//   * 
	   
		
		int star=7;
	
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
			{	
				if(i==1 || j==4)
				{
					System.out.print("*");
				}
				
				else if(i==2 & j==3 || i==2 & j==5 ||i==3 & j==3 ||i==3 & j==5  )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
				
			}
			System.out.println();
			
			
		}
		
	}

}

