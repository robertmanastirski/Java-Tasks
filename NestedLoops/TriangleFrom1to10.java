import java.util.Scanner;

public class TriangleFrom1to10 {

	public static void main(String[] args) {
		
		int N = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N: ");
		N = sc.nextInt();
		
		int number = 1;
		for(int i = N; i > 0; i--)
		{
			for(int j = i; j <= N; j++)
			{
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}

	}

}
