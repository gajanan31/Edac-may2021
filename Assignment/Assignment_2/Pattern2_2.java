public class Pattern2_2
{
public static void main(String args[])
{
	
 for(int i=1; i<=5; i++)
 {
	 for(int j=1; j<=5; j++)
		 {
			 if(j>=(5+1)-i)
	        System.out.print("*");
	 else
		System.out.print(" ");
	 }
	 
	  System.out.println();
 }

 }
}
