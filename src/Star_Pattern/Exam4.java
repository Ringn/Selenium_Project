package Star_Pattern;

public class Exam4 {
	public static void main(String[] args) 
	{
		//*****
		//* * *
		//* * *
		//* * *
		//*****    
		
		int star=5;//4
		int space=1;//2
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				if(i==1 || i==5 || j==1 || j==3 || j==5)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
	
			
		}
		
	}

}
