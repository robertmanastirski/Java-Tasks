import java.util.Scanner;

public class BathroomTileCalculator {

	public static void SplitNumbers(String BD, String TD)		//BD = bathroomDimensions, TD = tileDimensions
	{
		double A = 0, B = 0;
		double C = 0 , D = 0;
		String[] BDArr = new String[2];						//Split the string to get the numbers
		BDArr = BD.split(" ");
		A = Double.parseDouble(BDArr[0]);
		B = Double.parseDouble(BDArr[1]);
		
		String[] TDArr = new String[2];
		TDArr = TD.split(" ");
		C = Double.parseDouble(TDArr[0]);
		D = Double.parseDouble(TDArr[1]);
		Calculate(A,B,C,D);
	}
	public static void Calculate(double a, double b, double c, double d)
	{
	    double s1, s2;
		double b1, b2;
		
		s1 = a/c;									//Calculate from the first method.
		if(a % c > 0)
		{
			s1++;
		}
		
		s2 = b/d;
		if(b % d > 0)
		{
			s2++;
		}
		b1 = s1 * s2;
		
		if(b1 % 1 == 0)						//If calculation from the first method is not a decimal number print the result.
		{
			System.out.println("Minumum number of tiles required: " + (int)b1);
		}
		else								//If calculation from the first method is a decimal calculate by the second method.
		{
			s1 = Math.floor(a/d);			
			if(a % d > 0)
			{
				s1++;
			}
			
			s2 = Math.floor(b/c);
			if(b % c > 0)
			{
				s2++;
			}
			b2 = s1 * s2;
			System.out.println("Minumum number of tiles required: " + (int)b2);
		}
		
		
	}
	public static void main(String[] args) {
		String bathroomDimensions = "";
		String tileDimensions = "";
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please input your bathroom dimentions: ");
		bathroomDimensions = sc.nextLine();
		System.out.println("Please input your tile dimentions: ");
		tileDimensions = sc.nextLine();
		SplitNumbers(bathroomDimensions,tileDimensions);
		
	}

}
