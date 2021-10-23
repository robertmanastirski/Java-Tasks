
import java.util.Scanner;

public class Square0and1FullButDiagonalEquals2 {
    
    public static void main(String[] args) {
		
        int N = 0;
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
		
        N = sc.nextInt();
        
        int num = 0;
        for(int i = 0; i < N; i++)	
        {
            num = i;                //Set value of num to i in every iteration of the loop.
            for(int j = 0; j < N; j++)	
            {
                if (i == j) {
                    System.out.print("2");
                }
                if(j == num)  //Check if j == num. If true, print 1 and increase num by 1 so we can keep printing 1's.
                {
                    if(j == N - 1)  //Check if j == n - 1. If true break the loop so we don't print anymore 1's or 0's
                    {
                        break;
                    }
                    System.out.print("1");
                    num++;
                }
                else
                {
                    System.out.print("0");
                }
            }
            
            System.out.println();	
        }

    }
}
