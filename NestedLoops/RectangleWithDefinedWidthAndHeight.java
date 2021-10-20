import java.util.Scanner;

public class RectangleWithDefinedWidthAndHeight {

	public static void main(String[] args) {
		
		int N = 0, M = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input M(Width): ");
		M = sc.nextInt();
		System.out.println("Input N(Height): ");
		N = sc.nextInt();
		int number = 1;
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < M; j++)
			{
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
			
		}

	}

}
