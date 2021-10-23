import java.util.Scanner;

public class Square1and0Cross {
public static void main(String[] args) {
		
        int N = 0;
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
		
        N = sc.nextInt();
        
        for(int i = 0; i < N; i++)	
        {
            for(int j = 0; j < N; j++)	
            {
                if(i == j || i + j == N - 1)  //Check if the row == column & print 1 or if row + column == N - 1 & print 1.
                {
                    System.out.print("1");
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
