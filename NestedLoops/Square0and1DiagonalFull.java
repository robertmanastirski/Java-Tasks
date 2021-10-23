import java.util.Scanner;

public class Square0and1DiagonalFull {
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
                if(j == num)  //Check if j == num. If true, print 1 and increase num by 1 so we can keep printing 1's.
                {
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
