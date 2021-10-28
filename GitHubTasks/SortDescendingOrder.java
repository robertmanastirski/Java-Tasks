
import java.util.Scanner;

public class SortDescendingOrder {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        int itr = 0;                            //Do while iteration count
        
        for (int i = 0; i < numbers.length; i++) {
            do {
                System.out.println("Input your number: ");
                numbers[i] = sc.nextInt();
            } while (numbers[i] <= Math.pow(-10,9) || numbers[i] >= Math.pow(10, 9));
        }
        
        do {
            for (int i = 1; i < numbers.length; i++) {                  //Sorting for loop   
                if (numbers[i - 1] < numbers[i] ) {
                    int temp = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = temp;
                }
            }
          itr++; 
        } while (itr <= numbers.length);     //Do while loop to sort all the numbers in the array until we've reached the length of the array.
        
        for (int i = 0; i < numbers.length; i++) {      //Output sorted numbers
            System.out.print(numbers[i] + " ");
        }
        
    }
}
