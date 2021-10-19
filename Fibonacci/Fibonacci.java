import java.util.Scanner;

public class Fibonacci {
	public static void OutputFibonacci(int N)
	{
		int[] nums = new int[N+1];
		nums[0] = 1;
		nums[1] = 1;
		for(int i = 1; i < N; i++) //Generate the fibonacci sequence 
		{
			nums[i + 1] = nums[i] + nums[i - 1];
		}
		for(int i = 0; i < N; i++) //Print
		{
			System.out.print(nums[i] + " ");
		}
	}
	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		do										//Get a 6 digit input
		{
			System.out.println("Please input N: ");
			N = sc.nextInt();
			
		}while(N <= 1 || N >= 100);
		
		OutputFibonacci(N);
	}

}
