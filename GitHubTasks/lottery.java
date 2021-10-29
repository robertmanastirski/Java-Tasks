
import java.util.Scanner;

public class lottery {
    public static void FindWinner(int n)
    {
        int size = String.valueOf(n).length();          //Get the length of the number.
        int[] numbers = new int[size];                  
        int lastDuplicate = 0;
        boolean foundDuplicate = false;
        
        for (int i = numbers.length - 1; i >= 0; i--) {     //Separate the numbers adn save them into an array.
            numbers[i] = n % 10;                            //Since we get the numbers in reverse order we need to loop through the array backwards.
            n /= 10;
        }
        
        for (int i = numbers.length - 1; i > 0; i--) {      //Compare the last number(i) to the first,second,third(j)...until j < i.
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {             //If we have found a match set foundDuplicate to true and save the number to lastDuplicate.
                    foundDuplicate = true;                  
                    lastDuplicate = numbers[i];
                    break;                                  //Break the loop because we won't find matches that meet the criteria of the task.
                }
            }
            if (foundDuplicate) {                           //Check if we have found a match. If we have print it out and break;
                System.out.println(lastDuplicate);
                break;
            }
        }
        if (!foundDuplicate) {                  //If we have looped through all the numbers and have not found a match, print No.
            System.out.println("No");
        }
        
    }
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Input N: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n < 9 || n > 2000000000);      //Limit the input between 9 and 2000000000
        
        FindWinner(n);  
    }
}
