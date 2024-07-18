import java.util.Scanner;
class sc
 {
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a line of text: ");
String input = scanner.nextLine();
int specialCharCount = 0;
for (int i = 0; i < input.length(); i++) 
{
char c = input.charAt(i);
if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
 {
System.out.println("Special Character: " + c);
specialCharCount++;
}
}
System.out.println("Number of Special Characters: " + specialCharCount);
}
}
