import java.util.Scanner;

public class Assignment_15
{

public static void main(String args[])

{
Scanner sc=new Scanner(System.in);

System.out.print("Enter value of a = ");
 int a=sc.nextInt();
System.out.print("Enter value of b = ");
 int b=sc.nextInt();
 
 
 System.out.println("Before swapping Result a="+a+" , b="+b);
 int temp=a;
 a=b;
 b=temp;
 
 System.out.println("After swapping Result a="+a+" , b="+b);

}

}