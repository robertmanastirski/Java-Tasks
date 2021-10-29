
import java.util.Scanner;

public class relef {
    public static void CalcElevation(int n, String elevation)
    {
        int[] elevationNum = new int[n];    //Create an array to store the numbes of elevation
        elevationNum[0] = 1;                //Set the first point's elevation to 1
        
        for (int i = 1; i < n; i++) {       //Loop through the points checking the char at index i of the elevation input if its < ot >
            if (elevation.charAt(i - 1) == '<') {
                if (elevationNum[i - 1] <= 3) {
                    elevationNum[i] = elevationNum[i-1] + 1;    //If its < add 1 to elevation
                }else {
                    elevationNum[i] = elevationNum[i-1];        //If the elevation is 4, we cannot go higher so the elevation stays the same.
                }
                
            }else if(elevation.charAt(i - 1) == '>')
            {
                if (elevationNum[i - 1] >= 1) {
                    elevationNum[i] = elevationNum[i-1] - 1;    //If its > subtract 1 from elevation
                }else{
                    elevationNum[i] = elevationNum[i-1];        //If the elevation is 0, we cannot go lower so the elevation stays the same.
                }
            }
        }
        for (int i = 0; i < n; i++) {                           //Output the elevations
            System.out.print(elevationNum[i] + " ");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String elevation = "";
        do {
            System.out.print("Input N: ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 1 || n >= 100000);      //Limit the input between 9 and 100000
        do {
            System.out.print("Input elevation: ");
            elevation = sc.nextLine();
            
        } while (elevation.length() != n - 1);  //Limit elevation level to equal to n - 1
        
        CalcElevation(n, elevation);
        
    }
}
