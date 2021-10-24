
import java.util.Scanner;

public class FindTheMaxNumOfSequence {
    
    public static void main(String[] args) {
        int number = 0, maxNum = 0;
        
        Scanner sc = new Scanner(System.in);
        do {
            
            do {
                System.out.println("Please input your number: ");           //Input only positive integers
                number = sc.nextInt();
            } while (number < -1);
            
            if(number > maxNum)
            {
                maxNum = number;
            }
            
        } while (number != -1);
        
        System.out.println("The max number of the sequence is: " + maxNum);
        

    }
}
