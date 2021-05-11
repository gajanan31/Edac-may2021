public class Pattern2_14
{
public static void main(String args[])
{
	int k=	1;

for(int i=1;i<=9;i++)
{

for(int j=1;j<=9;j++)
{
 if(j>=i && j<=10-i && k==1 && i<=5)
    {
	 
	 System.out.print("*");
	 k=0;
	 
   }
   else if (j<=i && j>=10-i && k==1 && i>5)
   { 
    System.out.print("*");
	 k=0;
	 
   }
 else
 {
  System.out.print(" ");
  k=1;
  
 }
 }//inner loop
System.out.println();
}//outer loop

}//main
}//class