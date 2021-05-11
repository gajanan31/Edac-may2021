public class Pattern2_4
{
public static void main(String args[])
{
	
for(int i=1;i<=5;i++)
{

for(int j=1;j<=5;j++)
{
 if(j>=i)
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