public class Pattern2_16
{
public static void main(String args[])
{

for(int i=1;i<=5;i++)
{

for(int j=1;j<=5;j++)
{
 if(j==6-i || j==5 && i<=4)
    {
	 
	 System.out.print("*");
	 
   }else if(j<=i && i==5)
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