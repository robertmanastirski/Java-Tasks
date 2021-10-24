import java.util.Scanner;

public class CountOnlyEvenDigits {
    public static void main(String[] args) {
        int number = 0, numcount = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number: ");
        number = sc.nextInt();
        
        while (number % 10 > 0)
        {
            int tempnum = 0;
            tempnum = number % 10;
            
            if (tempnum % 2 == 0) {
                numcount++;
            }
            number = number / 10;
            
        };
        
        
        System.out.println("The even digit count is: " + numcount);

    }
}
