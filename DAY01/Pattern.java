import java.util.Scanner;
class Pattern{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of row");
		int x=sc.nextInt();
		for(int i=1; i<=x; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
	}
}