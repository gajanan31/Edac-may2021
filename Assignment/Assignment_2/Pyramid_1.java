public class Pyramid_1
{
public static void main(String args[])
{

int k=1;
for(int i=1;i<=9;i++)
{
for(int j=1;j<=17;j++)
{
 if(j>=10-i && j<=8+i && k==1)
 {
	  System.out.print(i);
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