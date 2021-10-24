
import java.util.Scanner;

public class GetTheLargestDigitFromANum {
    public static void main(String[] args) {
        int number = 0;
        int currentNum = 0, max = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number: ");
        number = sc.nextInt();
        
        while (number % 10 >= 0)
        {
            currentNum = number % 10;
            number = number / 10;
            
            if (currentNum > max) {
                max = currentNum;
            }
            if (number == 0) {
                break;
            }
        }
        
        System.out.println("The max largest from the number: " + max);

    }
}
