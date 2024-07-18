import java.util.Scanner;
class valid
 {
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a username: ");
String username = scanner.nextLine();
if (username.matches("^[a-zA-Z0-9_]{5,20}$")) 
{
System.out.println("Valid username!");
} 
else
 {
System.out.println("Invalid username.");
}
}
}
