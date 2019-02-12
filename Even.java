import java.util.Scanner;
class Even{
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the smaller integer:");
int numOne = keyboard.nextInt();
System.out.println("Enter the larger integer:");
int numTwo = keyboard.nextInt();
for (int i = numOne; i <= numTwo; i++) {
System.out.println( i + " ");
 }
    }
}
