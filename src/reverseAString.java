import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class reverseAString {

	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your string: ");
		str = sc.nextLine();								//Input your string
	
		char[] chars = new char[str.length()];
		
		StringBuffer strnormal = new StringBuffer(str);
		
		for (int i = 0; i < str.length(); i++) {
			chars[i] = strnormal.charAt(i);
        }
		
		int capacity = str.length();
		StringBuffer strreversed = new StringBuffer(capacity);
		for(int i = capacity - 1; i >= 0; i--)
		{
			strreversed.append(chars[i]);
		}
		
		System.out.print(strreversed);

	}

}
