
import java.util.Scanner;

public class MatrixSwitchColumnPQ {
    public static void MatrixInput(int M, int N, int P, int Q, Scanner sc)
    {
        int[][] matrix = new int[M][N];
        String input;
        
        for (int i = 0; i < M; i++) { //columns
            System.out.print("Input values for the matrix: ");
            for (int j = 0; j < N; j++) {       //rows
                matrix[i][j] = sc.nextInt();
            }
        }
        SwitchColumns(matrix, M, N, P, Q);
        PrintMatrix(matrix, M, N);
    }
    public static void SwitchColumns(int[][] matrix, int M, int N, int P, int Q)
    {
        int tempP = 0, tempQ = 0;
        for (int i = 0; i < M; i++) {           //columns
            for (int j = 0; j < N; j++) {       //rows
                if (j == P - 1) {
                    tempP = matrix[i][j];
                    tempQ = matrix[i][Q - 1];
                    matrix[i][Q - 1] = tempP;
                    matrix[i][j] = tempQ;
                }
            }
        }
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
        int M,N,P,Q;

        do {
            System.out.print("Please input M N P Q: ");
            input = sc.nextLine();
            String[] splitInput = input.split(" ");
            M = Integer.parseInt(splitInput[0]);
            N = Integer.parseInt(splitInput[1]);
            P = Integer.parseInt(splitInput[2]);
            Q = Integer.parseInt(splitInput[3]);
        } while (M <= 1 || N >= 100 || P <= 1 || Q >= N);
        
        MatrixInput(M,N,P,Q, sc);
        
    }
}
