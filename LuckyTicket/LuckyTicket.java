import java.util.Scanner;

public class LuckyTicket {
	public static void CheckNum(int ticketnum)
	{
		int firstDigitSum = 0, lastDigitSum = 0;
		for(int i = 0; i <= 5; i++)
		{
			if(i <= 2)				//Getting the remainder give us the numbers in reverse order. Check if i <= 2 that means we're getting the last 3 digits
			{
				lastDigitSum += ticketnum % 10;
			}else					//If i > 2 we're getting the first 3 digits.
			{
				firstDigitSum += ticketnum % 10;
			}
			ticketnum = ticketnum / 10;
		}
		if(firstDigitSum == lastDigitSum)	//Check if the sum of first digits == sum of lastdigits & print the first digit sum if the sums are equal.
		{
			System.out.println(firstDigitSum);
		}else
		{
			System.out.println("-1");
		}
		
	}

	public static void main(String[] args) {
		int ticketnum = 0;
		Scanner sc = new Scanner(System.in);
		do										//Get a 6 digit input
		{
			System.out.println("Please input your 6 digit number: ");
			ticketnum = sc.nextInt();
			
		}while(ticketnum <= 99999 || ticketnum >= 1000000);
		
		CheckNum(ticketnum);
	}

}
