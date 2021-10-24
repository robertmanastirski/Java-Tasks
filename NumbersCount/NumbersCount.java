
import java.util.Scanner;

public class NumbersCount {
    
    public static void main(String[] args) {
        int number = 0, numcount = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number: ");
        number = sc.nextInt();
        
        while (number % 10 > 0)
        {
            number = number / 10;
            numcount++;
        };
        
        
        System.out.println("The number count is: " + numcount);

    }
}
