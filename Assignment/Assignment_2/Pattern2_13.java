public class Pattern2_13
{
public static void main(String args[])
{
	
for(int i=1;i<=9;i++)
{

for(int j=1;j<=5;j++)
{
 if(j>=i && i<=5)
    {
	 
	 System.out.print("*");
	 }
	 
	 else if(j>=10-i && i>5)
		 {
	 
	 System.out.print("*");
	 }
   
 else
 {
  System.out.print(" ");
 
 }
 }//inner loop
System.out.println();
}//outer loop

}//main
}//class