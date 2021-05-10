import java.util.Scanner;
public class Assignment_13
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter Height of rectangle :");        
	
	double h=sc.nextDouble();
		System.out.println("Enter Width of rectangle :");        
     double w=sc.nextDouble();
	
	double area=h*w;
	double peri=2*(h+w);
	
	
       
	   	System.out.println("Perimeter of rectangle is :"+peri);   
	   	System.out.println("Area of ractangle is :"+area);        
		

    }
}