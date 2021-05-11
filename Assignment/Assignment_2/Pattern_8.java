public class Pattern_8
{
public static void main(String args[])
{

int k=1,l=5,m=5;
for(int i=1;i<=5;i++)
{
 l=m--;
for(int j=1;j<=9;j++)
{
	
 if(j>=6-i && j<=4+i && k==1)
 {   
	 System.out.print(l);
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