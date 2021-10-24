
import java.util.Scanner;

public class GetTheSumFromTheDigitsInEvenPos {
    
    public static int countNums(int number)
    {
        int numcount = 0;
         while (number % 10 > 0)
        {
            number = number / 10;
            numcount++;
        };
        return numcount;
    }
    
    public static void main(String[] args) {
        int number = 0;
        int currentNum = 0, sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number: ");
        number = sc.nextInt();
        
        int i = countNums(number);         //First we count the numbers because when we do "number % 10" we get the numbers in reverse order and we need the index to correctly correspond to the number.
        while (number % 10 >= 0)
        {
            currentNum = number % 10;
            number = number / 10;
            if (i % 2 == 0) {
                sum += currentNum;
            }
            i--;
            
            if (number == 0) {
                break;
            }
        }
        
        System.out.println("The max largest from the number: " + sum);

    }
}
