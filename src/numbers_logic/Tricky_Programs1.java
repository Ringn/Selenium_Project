package numbers_logic;

public class Tricky_Programs1 {
	public static void main(String[] args)
	{
		//7 8 9
		//6 1 2
		//5 4 3
		
		int a=3;//take input 3
		int m=1;
		int n=1;
		for(int i=1;i<=3;i++)//rows
		{
			for(int j=1;j<=3;j++)
			{
				if(i==n&j==m)
				{
					System.out.print(a*2+1+" ");
					
				}
				m++;
				if(i==n&j==m)
				{
					System.out.print(a*2+2+" ");
				}
				m++;
				if(i==n&j==m)
				{
					System.out.print(a*2+3+" ");
				}
				
             n++;
				
			}
			
			System.out.println();
			
		}
		
	}

}
