import java.util.Scanner;

public class OutputFirstTwoMaxNums {
	public static void FindMaxAndCount(int[] N)
	{
		int max = 0, max2 = 0;
		for(int i = 0; i < N.length; i++)
		{
			
			if(max < N[i])
			{
				max2 = max;
				max = N[i];
			}
			if(N[i] < max && N[i] > max2)
			{
				max2 = N[i];
			}
			
			
		}
		System.out.println("Max number is: " + max + " and the next max number is " + max2);
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
		FindMaxAndCount(N);

	}

}
