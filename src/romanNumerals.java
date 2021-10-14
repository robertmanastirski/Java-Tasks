import java.util.Scanner;

public class romanNumerals {
	public static String convert(int number, String[] romanCharacters, int[] values)
	{
		String roman = "";		
		int result = number;		
		while(result > 0)		
		{
			for(int i = 0; i <= values.length; i++)	//Loop through the values array
			{
				if(result - values[i] >= 0)		//Check if result minus the value on index i is higher or equal to 0
				{
					roman += romanCharacters[i];	//Save the roman letter
					result -= values[i];			//Substract the value that is on index i from result
					break;							//Break the loop so we can loop through the values again with the new result.
				}
			}
		}
		
		return roman;
	}
	public static void main(String[] args) {
		int number = 0;
		String result = "";
		String[] romanCharacters = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] values = new int[]{1000, 900, 500, 400,100, 90, 50, 40, 10, 9, 5, 4, 1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Decimal Number: ");		//Input number
		number = sc.nextInt();	
		
		result = convert(number, romanCharacters, values);
		System.out.println(result);
		
	}

}
