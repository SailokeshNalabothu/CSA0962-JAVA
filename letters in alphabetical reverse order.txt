import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ReverseAlphabeticalOrder
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        
        Character[] chars = new Character[word.length()];
        for (int i = 0; i < word.length(); i++) 
{
            chars[i] = word.charAt(i);
        }
        
        Arrays.sort(chars, Collections.reverseOrder());
        
        StringBuilder result = new StringBuilder();
        for (char c : chars)
 {
            result.append(c);
        }
        
        System.out.println("Word in reverse alphabetical order: " + result.toString());
        
        scanner.close();
    }
}
