import java.util.Scanner;

public class FibonacciIndexN {
	public static void OutputFibonacci(int N)
	{
		int A = 1, B = 1;
		int C = 0;
		for(int i = 2; i < N ; i++)
		{
			C = A + B;
			A = B;
			B = C;
		}
		System.out.println(C);
		
		
	}
	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		do										
		{
			System.out.println("Please input N: ");
			N = sc.nextInt();
			
		}while(N <= 1 || N >= 100);
		
		OutputFibonacci(N);
		
	}

}
