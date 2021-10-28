
import java.util.Scanner;

public class Skating {
    public static void CalculateScore(int[] scores)
    {
        int highestScore = 0, lowestScore = scores[0], scoresSum = 0;
        int sameScoreCount = 0;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highestScore) {         //Find the highest score
                highestScore = scores[i];
            }
            if (scores[i] < lowestScore) {          //Find the lowest score
                lowestScore = scores[i];
            }
            if (scores[0] == scores[i]) {           //Count how many scores are the same
                sameScoreCount++;
            }
        }
        for (int i = 0; i < scores.length; i++) {   //Find the sum of the scores
            scoresSum += scores[i];
        }
        if (sameScoreCount != scores.length) {      //If the count of the same scores is different than the length of the array
            scoresSum -= highestScore;              //Subtract the highest score from the sum
            scoresSum -= lowestScore;               //Subtract the lowest score from the sum
        }                                           //If the count of the same scores is the same as the length of the array, output the same because all scores are the same.
        System.out.println("The final score is: " + scoresSum);
    
    }
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);                       
        
        System.out.print("Input the scores: ");
        String input = sc.nextLine();
        String[] splitInput = input.split(" ");     //Split the string so we can get the numbers only.
        
        for (int i = 0; i < scores.length; i++) {
            while(Integer.parseInt(splitInput[i]) > 20 || Integer.parseInt(splitInput[i]) < 0)      //Check if any of the inputted scores is > 20 ot < 0
            {
                System.out.print("Invalid score ! Please input another score for judge " + (i+1) +": " );   //If it is input another score for that judge.
                splitInput[i] = sc.nextLine();
            }
            scores[i] = Integer.parseInt(splitInput[i]);
        }
        CalculateScore(scores);
        
    }
}
