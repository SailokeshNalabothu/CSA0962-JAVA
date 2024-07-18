import java.util.*;
class sorting 
{
public static void main(String[] args)
 {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of names: ");
int n = scanner.nextInt();
scanner.nextLine(); 
String[] names = new String[n];
System.out.println("Enter the names:");
for (int i = 0; i < n; i++)
 {
names[i] = scanner.nextLine();
}
System.out.print("Sort in ascending (A) or descending (D) order: ");
String order = scanner.nextLine().toUpperCase();
if (order.equals("A")) 
{
Arrays.sort(names);
} else if (order.equals("D")) 
{
Arrays.sort(names, Collections.reverseOrder());
}
 else 
{
System.out.println("Invalid input. Please enter 'A' for ascending or 'D' for descending order.");
return;
}
System.out.println("Sorted names:");
for (String name : names)
 {
System.out.println(name);
}
scanner.close();
}
}
