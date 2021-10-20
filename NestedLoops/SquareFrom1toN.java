import java.util.Scanner;

public class SquareFrom1toN {

	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N: ");
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(i + 1);
			}
			System.out.println();
		}

	}

}
