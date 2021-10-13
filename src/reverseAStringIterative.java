import java.util.Scanner;

public class reverseAStringIterative {

	public static void main(String[] args) {
		String str = "";
		String reversed = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your string: ");
		str = sc.nextLine();								//Input your string
		
		char[] chars = new char[str.length()];				//Create a char array for the charactes from the string to be stored in.
		for(int i = 0; i < str.length(); i++)
		{
			chars[i] = str.charAt(i);						//Store the characters in the char array
		}
		for(int i = str.length() - 1; i > -1; i--)
		{
			reversed += chars[i];							//Reverse the characters
		}
		
		System.out.println(reversed);
	}

}
