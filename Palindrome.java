import java.util.Scanner;
class Palindrome {
  public static void main(String[] args) {
    System.out.print(" ");
Scanner read = new Scanner(System.in);
int num = read.nextInt();
int n = num;

int rev=0,rmd; 
while(num > 0) 
{ 
rmd = num % 10; 
rev = rev * 10 + rmd; 
num = num / 10; 
} 
if(rev == n) 
System.out.println("yes "); 
else 
System.out.println("no "); 
  }
}
