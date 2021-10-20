import java.util.Scanner;

public class MinMaxNumberDifference {
	
	public static void FindDifference(int[] N)
	{
		int min = N[0], max = 0;
		for(int i = 0; i < N.length; i++)
		{
			if(max < N[i])
			{
				max = N[i];
			}
			if(min > N[i])
			{
				min = N[i];
			}
		}
		System.out.println("The difference between the max number & the minimum number is: " + (max - min));
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
		
		FindDifference(N);
	}

}
