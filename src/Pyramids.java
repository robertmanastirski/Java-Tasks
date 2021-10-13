import java.util.Scanner;

public class Pyramids {
	
	public static void Pattern1(int num)
	{
		for(int i=0;i<num;i++) 		//Print rows
		{
			for(int s = num - i; s > 1; s--)	//Print number of spaces
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++)		//Print columns
			{
				System.out.print(i + 1);  //Print i + 1 so we can get the same number on every row.
				System.out.print(" ");
			}
			System.out.println(i + 1);

		}
	}
	public static void Pattern2(int num)
	{
		for(int i=0;i<num;i++) 		//Print rows
		{
			for(int s = num - i; s > 1; s--)	//Print number of spaces
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++)		//Print columns
			{
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println(i+1);

		}
	}
	public static void Pattern3(int num)
	{
		for(int i=0;i<num;i++) 		//Print rows
		{
			for(int s = num - i; s > 1; s--)	//Print number of spaces
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++)		//Print columns
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("*");

		}
	}

	public static void main(String[] args) {
		
		int num = 0;
		int pattern = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in your pyramid?");
		num = sc.nextInt();
		System.out.println("Which pattern you want in your pyramid?");
		pattern = sc.nextInt();
		
		switch (pattern)
		{
			case 1: Pattern1(num); break;
			case 2: Pattern2(num); break;
			case 3: Pattern3(num); break;
			//case 4: Pattern4(num); break;
			//case 5: Pattern5(num); break;
			//case 6: Pattern6(num); break;
			
		}
		
	}

}
