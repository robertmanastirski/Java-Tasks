import java.util.Scanner;

public class SquareFrom1to9 {

	public static void main(String[] args) {
		
		int N = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N: ");
		N = sc.nextInt();
		
		int number = 1;
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(number);
				number++;
			}
			System.out.println();
		}

	}

}
