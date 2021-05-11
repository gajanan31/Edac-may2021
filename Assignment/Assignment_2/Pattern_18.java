public class Pattern_18
{
public static void main(String args[])
{

 
for(int i=1;i<=5;i++)
{
int k=65;
 
for(int j=1;j<=5;j++)
{
 if(j<=6-i)
 {
	 System.out.print(" "+(char)k+" ");
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