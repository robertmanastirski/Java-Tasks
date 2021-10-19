import java.util.Scanner;

public class SymmetricalNumber {
	
	public static void Check(int num)
	{
		int a1,a2,a3;
		a3 = num % 10;
	    num = num / 10;
	    a2 = num % 10;
	    num = num / 10;
	    a1 = num % 10;
	    num = num / 10;
	    if(a3 == a1)
	    {
	    	System.out.println("YES");
	    }else
	    {
	    	System.out.println("NO");
	    }
		
	}
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your number: ");
		num = sc.nextInt();
		Check(num);
		
	}

}
