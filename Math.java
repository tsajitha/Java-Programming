import java.util.*;
class Math {
  public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
 System.out.println("enter the first num");
int num1=sc.nextInt();
System.out.println("enter the sec num");
int num2=sc.nextInt();
System.out.println("enter the third num");
int num3=sc.nextInt();
*
System.out.println("enter the fourth num");
int num4=sc.nextInt();
System.out.println("enter the fifth num");
int num5=sc.nextInt();
System.out.println("enter the sixth num");
int num6=sc.nextInt();
    int add,sub,div,mul;
    add=num1+num2+num3+num4+num5+num6;
    sub=num1-num2-num3-num4-num5-num6;
    div=num1/num2/num3/num4/num5/num6;
    mul=num1*num2*num3*num4*num5*num6;
    System.out.println("addition of six numbers:"+add);
    System.out.println("division of two numbers:"+div);
    System.out.println("subtraction of two numbers:"+sub);
    System.out.println("multiplication of two numbers:"+mul);
  }
}