package Star_Pattern;

public class Exam6 {
	public static void main(String[] args) 
	{
		//******
		// ****
		// ****
		//******
		
		int star=6;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
			{
				if(i==1||i==4 || j==2||j==3||j==4||j==5 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
		
	}

}
