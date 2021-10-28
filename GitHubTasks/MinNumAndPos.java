
import java.util.Scanner;

public class MinNumAndPos {
    public static void FindMin(int[] N)
	{
            int min = N[0], pos = 1;
            for(int i = 0; i < N.length; i++)
            {
                if(N[i] < min)
                {
                    min = N[i];
                    pos = i + 1;
                }
            }
            System.out.println("Min number is: " + min + " and its on position: " + pos);
	}
	
	public static void main(String[] args) {
            int N = 0;

            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("How many numbers would you like to input: ");
                N = sc.nextInt();
                sc.nextLine();
            } while (N <= 1 || N >= 100000);
            
            int[] A = new int[N];
            
            System.out.print("Input the numbers: ");
            String input = sc.nextLine();
            String[] splitInput = input.split(" ");     
            
            for (int i = 0; i < A.length; i++) {
                for (int j = i + 1; j < A.length; j++) {                    //Check if numbers are different
                    while((Integer.parseInt(splitInput[j]) == Integer.parseInt(splitInput[i]) || Integer.parseInt(splitInput[j]) <= 1 || Integer.parseInt(splitInput[j]) >= Math.pow(10, 9)))
                    {
                       System.out.print("Invaild number ! Please input another number for position " + (j + 1) +": " );   
                       splitInput[j] = sc.nextLine();
                    } 
                }
                A[i] = Integer.parseInt(splitInput[i]);
            }

            FindMin(A);
	}
}
