
import java.util.Scanner;

public class GetSumOfDifferenceOfDigitsOnEvenAndOddPos {
    
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
        int currentNum = 0, sumEven = 0, sumOdd = 0, difference = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number: ");
        number = sc.nextInt();
        
        int i = countNums(number);
        while (number % 10 >= 0)
        {
            currentNum = number % 10;
            number = number / 10;
            
            if (i % 2 == 0) {
                sumEven += currentNum;
            }else
            {
                sumOdd += currentNum;
            }
            i--;
            
            if (number == 0) {
                break;
            }
        }
        difference = sumEven - sumOdd;
        System.out.println("The max largest from the number: " + Math.abs(difference));

    }
}
