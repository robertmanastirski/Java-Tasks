
import java.util.Scanner;

public class maxk {
    public static void FindMaxSum(int[] sequence, int k)
    {
        int max = 0, prevMax = 0;
        for (int i = 1; i < sequence.length; i+=k) {    //Loop through the sequence by incrementing i + k times
            
            max += sequence[i] + sequence[i-1]; //Sum the current and last element
            
            if (max > prevMax) {    //if max > prevmax save max in prevmax and set max to 0
                prevMax = max;
                max = 0;
            }
        }
        System.out.println("The max sum of k consecutive elements is: " + prevMax);
    }
    
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Input the numbers: ");        
            String inputNK = sc.nextLine();
            String[] splitNK = inputNK.split(" ");  //Split the string
            n = Integer.parseInt(splitNK[0]);       //Get the numbers and save them into int variables. 
            k = Integer.parseInt(splitNK[1]);                   
        } while (n <= 1 || n >= 100000 || k >= n);      //Limit the input of K & N.
        
        int[] sequence = new int[n];
        System.out.print("Input your sequence: ");
        String input = sc.nextLine();
        String[] splitSeq = input.split(" ");    //Split the string
        
        for (int i = 0; i < sequence.length; i++) {
            while(Integer.parseInt(splitSeq[i]) <= -9999 || Integer.parseInt(splitSeq[i]) >= 9999)  //Limit the input of numbers in the sequence from 9999 to -9999.
            {
                System.out.print("Invaild number ! Please input another number for position " + (i + 1) +": " );
                splitSeq[i] = sc.nextLine();
            }
            sequence[i] = Integer.parseInt(splitSeq[i]); //Get the numbers and save them into the sequence array. 
        }
        
        FindMaxSum(sequence, k);
        
    }
}
