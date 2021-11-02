import java.util.Scanner;

public class MatrixSwitchMinAndMaxNumPos {
    public static void MatrixInput(int M, int N, Scanner sc)
    {
        int[][] matrix = new int[M][N];
        String input;
        
        for (int i = 0; i < M; i++) { 
            System.out.print("Input values for the matrix: ");
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        SwitchMinMax(matrix, M, N);
        PrintMatrix(matrix, M, N);
    }
    public static void SwitchMinMax(int[][] matrix, int M, int N)
    {
        int min = matrix[0][0], max = 0;        //Define min and max ints & ints for the indexes.
        int indexMinC = 0, indexMinR = 0;
        int indexMaxC = 0, indexMaxR = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] > max) {   //Loop through the matrix and check if the current number > max
                    max = matrix[i][j];     //If it is save the current number in max
                    indexMaxC = i;          //Save the index for the column
                    indexMaxR = j;          //Save the index for the row.
                }else if(matrix[i][j] < min)// Else check if the current number < min
                {
                    min = matrix[i][j]; //If it is save the current number in min
                    indexMinC = i;      //Save the index for the column
                    indexMinR = j;      //Save the index for the row.
                }
            }
        }
        matrix[indexMinC][indexMinR] = max;         //Switch the numbers
        matrix[indexMaxC][indexMaxR] = min;
    }
    public static void PrintMatrix(int[][] matrix, int M, int N)
    {
        for (int i = 0; i < M; i++) {           
            for (int j = 0; j < N; j++) {       
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int M,N;

        do {
            System.out.print("Please input M N: ");
            input = sc.nextLine();
            String[] splitInput = input.split(" ");
            M = Integer.parseInt(splitInput[0]);
            N = Integer.parseInt(splitInput[1]);
        } while (M <= 1 || N >= 100);
        
        MatrixInput(M, N, sc);
        
    }
}
