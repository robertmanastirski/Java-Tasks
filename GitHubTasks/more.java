
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class more {
    public static void sortKeys(Map<Character, Integer> letters)
    {
        Map<Character, Integer> sort = new TreeMap<>();
        sort.putAll(letters);   //Copy the map keys and values to a treemap.
        
        for (Map.Entry<Character, Integer> entry : sort.entrySet()) {       //Treemap already sorts the keys in alphabetical order so we just output the keys & values.
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void CheckString(String s)
    {
        Map<Character, Integer> letters = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {          
            for (int j = i + 1; j < s.length(); j++) { //Compare each letter to the next one
                    if (s.charAt(i) == s.charAt(j)) {   //If we have a match
                        if (letters.containsKey(s.charAt(i))) { //Check if the letter is not already contained in the map
                            letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1); //If it is increment its value by 1.
                        }else
                        {
                            letters.put(s.charAt(i), 2);    //If its not add the letter to the map.
                        }
                    break;  //When we get a match break the loop.
                }
            }
        }
        if (letters.isEmpty()) {    //Check if the string contains an duplicate letters
            System.out.println("This string does not contain duplicate letters.");
        }
        sortKeys(letters); //If yes sort them
    }
    
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Input your string: ");
            s = sc.nextLine();
            
        } while (s.length() <= 1 || s.length() >= 100 || s.contains(" "));      //Limit the input to be between 1 & 100 characters and it should not contain spaces.
        
        CheckString(s);
    }
	
}
