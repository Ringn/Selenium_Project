package logical_programs;

public class Factorial2 {
	public static void main(String[] args)
	{
		//find factorial of 5=5*4*3*2*1
		
		int num=5;
		int fact=1;
		for(int i=1;i<=5;i++)//for factorial we want 5
		{
			fact=fact*i;//1=1*1//2=1*2//6=2*3//24=6*4//120=24*5
			
		}
		System.out.println(fact);
		
	}

}
