import java.util.Scanner;

public class SquareFrom1toNRepeat {

	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N: ");
		N = sc.nextInt();
		

		for(int i = 1; i <= N; i++)
		{
			
			for(int j = i; j <= N; j++)
			{
				System.out.print(j);
				
			}
			for(int j = 1; j < i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
