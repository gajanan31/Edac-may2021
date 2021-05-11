public class Pattern2_12
{
public static void main(String args[])
{

for(int i=1;i<=9;i++)
{

for(int j=1;j<=5;j++)
{
 if( i<=5 && j<=6-i )
    {
	 
        System.out.print("*");
   
    }
	else if(i>=6 && j<=i-4)
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