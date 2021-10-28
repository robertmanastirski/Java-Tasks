import java.util.Scanner;

public class FindTheLongestSequence {
    public static void FindLongest(int[] sequence, int N)
    {
        int firstIndex = 0, maxSequence;
        boolean foundIndex = false;
        for (int i = 0; i < sequence.length; i++) {     //Loop through the sequence from the start.
            for (int j = N - i; j > 0; j--) {           //Loop through the sequence from the end. 
                if (sequence[i] == sequence[j - 1]) {   //If we find the same integers on the same index from the start and the end
                    foundIndex = true;                  //Set to true so we can break the loop
                    firstIndex = i;                     //Save the start index that the match was found on.
                }
                break;                              //Break the loop everytime so we can loop through the start and the end array at the same time.
            }
            if (foundIndex) {   //If we have found a match break the loop.
                break;
            }
        }
        
        maxSequence = N - firstIndex*2;         //Since the match will everytime be on the same index from start and end, substract the found index * 2 from the length of the sequence.
        System.out.println("The length of the sequence: " + maxSequence);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {                                //Input how many numbers will be in the sequence
            System.out.print("Input N: ");
            N = sc.nextInt();
            sc.nextLine();
        } while (N < 1 || N >= 10000);  //Limit the input between 1 & 10000
        
        int[] sequence = new int[N];
        System.out.print("Input your sequence: ");
        String input = sc.nextLine();
        String[] splitSeq = input.split(" ");    //Split the string to get the numbers
        
        for (int i = 0; i < sequence.length; i++) {
            while(Integer.parseInt(splitSeq[i]) <= 0 || Integer.parseInt(splitSeq[i]) >= Math.pow(10, 16))  //Check if all the numbers in the sequence are between 0 and 10 to the power of 16
            {
                System.out.print("Invaild number ! Please input another number for position " + (i + 1) +": " ); //If any of the number is not user needs to input another number.
                splitSeq[i] = sc.nextLine();
            }
            sequence[i] = Integer.parseInt(splitSeq[i]); //Save the numbers to an int array.
        }
        FindLongest(sequence, N);
    }
}
