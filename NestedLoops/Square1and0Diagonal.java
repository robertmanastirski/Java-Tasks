
import java.util.Scanner;

public class Square1and0Diagonal {
    public static void main(String[] args) {
		
        int N = 0;
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
		
        N = sc.nextInt();
        
        for(int i = 0; i < N; i++)	
        {
            for(int j = 0; j < N; j++)	
            {
                if(i == j)
                {
                    System.out.print("1");
                }else
                {
                    System.out.print("0");
                }
            }
            System.out.println();	
        }

    }
}
