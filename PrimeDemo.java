import java.util.Scanner;
class PrimeDemo
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no to check prime ");
		int n =s.nextInt();
		int i;
		for( i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("no is not prime ");
				break;

			}
		}	
			if(n==i)
			{
				System.out.println("no is prime ");
			}
		
	}
}