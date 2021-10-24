
import java.util.Scanner;

public class TriangleFromStarsCentered {
    
    public static void main(String[] args) {
        int N = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++)
        {
            for (int j = N; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
