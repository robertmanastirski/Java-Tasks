import java.util.Scanner;

public class password {
    public static void ModifyPassword(String password)
    {
        char[] arrPass = new char[password.length()];   
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] alphabetCount = new int[26]; //Array to save the count of the used alphabet letters.
        
        for (int i = 0; i < password.length(); i++) {   //Break down the characters from the password and save them into an array.
            arrPass[i] = password.charAt(i);
        }
        
        for (int i = 0; i < alphabet.length; i++) {         
            for (int j = 0; j < arrPass.length; j++) {
                if (alphabet[i] == arrPass[j]) {    //Check if the current char == the char of the alphabet
                    alphabetCount[i] += 1;          //If it does increase the count of that character by 1;
                }
            }
        }
        int count = 1;          //Count how many chracters are one after another in the password.
        for (int i = 1; i < arrPass.length; i++) {
            if (arrPass[i] == arrPass[i-1]) {       //If the current character in the password == the previous character
                count++;        //Increase the count
                if (count == 3) {   //If count gets to 3
                    for (int j = 0; j < alphabetCount.length; j++) {    //Loop through alphabetCount to check which letter is used under 3 times
                        if (alphabetCount[j] < 3) {     
                            arrPass[i] = alphabet[j];   //Whichever one is, we change the current character of the password to that one.
                            alphabetCount[j] += 1;      //Then we increase the used count on that character by 1;
                            break;
                        }
                    }
                }
            }else
            {
                count = 1;      //Set the count to 1 so we can count again if we have more than 1 sequence of the same characters next to eachother.
            }
        }
        PrintNewPassword(arrPass);
    }
    public static void PrintNewPassword(char[] arrPass)
    {
        String newPassword = "";
        for (int i = 0; i < arrPass.length; i++) {
            newPassword += arrPass[i];
        }
        System.out.println("Your new password is: " + newPassword);
    }
    
    public static void main(String[] args) {
        String password = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Input your password: ");
            password = sc.nextLine();
        } while (password.length() <= 2 || password.length() >= 5000);  //Limit the inout between 2 & 5000.
        
        ModifyPassword(password.toLowerCase());         //change password to lowercase.
        
    }
}
