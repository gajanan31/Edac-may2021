import java.util.Scanner;
public class Assignment_11
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter radious :");        
	int n=sc.nextInt();
	double pi=3.14;
	double peri=2*pi*n;
	double are=pi*(n*n);
	
	
       
	   	System.out.println("Perimeter is :"+peri);   
	   	System.out.println("Area is :"+are);        
		

    }
}