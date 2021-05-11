public class Pattern_17
{
public static void main(String args[])
{

int k=1;
 
for(int i=1;i<=5;i++)
{

 
for(int j=1;j<=6;j++)
{
  if(j<=i)
 {
	System.out.print(" "+k+" ");
	k++;
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