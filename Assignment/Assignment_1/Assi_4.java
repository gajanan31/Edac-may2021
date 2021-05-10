import java.util.Scanner;

class Assignment_4
{
 public static void main(String args[])
 
 {
   int a,b,c,d,e,f;
   Scanner sc=new Scanner(System.in);
   System.out.println("Please enter 3 no for operation 1");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   int i=a+b*c;
   
   System.out.println("Result of operation 1 :"+ i);
   System.out.println("Please enter 3 no for operation 2");
   
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();

   int j=a+b;
   int k=j%c;
   
    System.out.println("Result of operation 2 :"+ k);
    System.out.println("Please enter 4 no for operation 3");
	
	a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
   
   
   int l= a+b*c/d;
   
   System.out.println("Result of operation 3 :"+ l);
   
    System.out.println("Please enter 6 no for operation 4");
	
	a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    f=sc.nextInt();
	
	int m=a+b/c*d-e%f;
    
      System.out.println("Result of operation 4 :"+ m);


 }
}