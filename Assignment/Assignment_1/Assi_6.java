import java.util.Scanner;

public class Assignment_6{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers :");

int i=sc.nextInt();
int j=sc.nextInt();

int k=i+j;
int l=i-j;
int m=i*j;
int n=i/j;

System.out.println("Addition is :"+ k);
System.out.println("Substract is :"+ l);
System.out.println("Multiple is :"+ m);
System.out.println("Devision is :"+ n);

}
}