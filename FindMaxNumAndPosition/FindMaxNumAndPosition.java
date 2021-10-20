import java.util.Scanner;

public class FindMaxNumAndPosition {
	
	public static void FindMax(int[] N)
	{
		int max = 0, pos = 0;
		for(int i = 0; i < N.length; i++)
		{
			if(max < N[i])
			{
				max = N[i];
				pos = i + 1;
			}
		}
		System.out.println("Max number is: " + max + " and its in position: " + pos);
	}
	
	public static void main(String[] args) {
		int NumCount = 0, currentNum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to input: ");
		NumCount = sc.nextInt();
		int[] N = new int[NumCount];
		
		for(int i = 0; i < NumCount; i++)
		{
			do										
			{
				System.out.println("Input your numbers one by one: ");
				currentNum = sc.nextInt();
				
			}while(currentNum <= 0);
			N[i] = currentNum;
		}
		
		FindMax(N);
	}

}
