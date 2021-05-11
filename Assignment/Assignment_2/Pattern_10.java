public class Pattern_10
{
public static void main(String args[])
{

int k=1,l=69,m=69;
for(int i=1;i<=5;i++)
{
 l=m--;
for(int j=1;j<=9;j++)
{
	
 if(j>=6-i && j<=4+i && k==1)
 {   
	 System.out.print((char)l);
     l++;
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