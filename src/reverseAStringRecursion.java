import java.util.Scanner;

public class reverseAStringRecursion {
	public static String reverse(String str, int strlength, String reversed)
	{
		int i = strlength;				//Assign i to the string length for interations.

		if(i != 0)						//Check if there are more characters in the string.
		{
			char tempchar = str.charAt(i - 1);		//Get the char at the index position
			reversed += tempchar;					//Add the char to the final reversed string
			i--;									
			return reverse(str, i, reversed);		//Call the method again until the end of the chars in the string.
		}
		
		return reversed;							//Finally return the reversed string
		
	}
	public static void main(String[] args) {
		String str = "";
		String reversed = "";
		int strlength = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your string: ");
		str = sc.nextLine();								//Input string
		
		strlength = str.length();
		reversed = reverse(str, strlength, reversed);	
		System.out.println("Your reversed string is: " + reversed);	//Output the reversed string
		
	}

}
