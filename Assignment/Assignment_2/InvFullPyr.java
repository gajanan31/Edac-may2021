public class InvFullPyr
{
public static void main(String args[])
{

int k=1;
for(int i=1;i<=6;i++)
{
for(int j=1;j<=11;j++)
{
 if(j>=i && j<=12-i && k==1)
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