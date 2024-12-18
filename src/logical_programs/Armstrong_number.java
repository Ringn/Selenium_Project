package logical_programs;

import java.util.Scanner;

public class Armstrong_number {
	public static void main(String[] args) 
	{
		//the nubers cube sume is equal to number is a armstrong number
		//153=1cube+5cube+3cube=153
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a nuber to verify weather the num is armstrong or not");
		int arm = sc.nextInt();
		
		int sum=0;
		
		for(int i=arm;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(arm==sum)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not armstrong");

		}
	}

}
