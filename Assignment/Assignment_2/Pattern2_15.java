public class Pattern2_15
{
public static void main(String args[])
{

for(int i=1;i<=5;i++)
{

for(int j=1;j<=5;j++)
{
 if( j==1 || j==i && i<=4)
    {
	 System.out.print("*");
   }else if(i==5 || j==i)
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