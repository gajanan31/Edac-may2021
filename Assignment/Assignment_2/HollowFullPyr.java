public class HollowFullPyr
{
public static void main(String args[])
{

int k=1;
for(int i=1;i<=6;i++)
{
for(int j=1;j<=11;j++)
{
	
	if(i==6 && k==1)
	{
		System.out.print("*");
     k=0;
		
	}
    else if(j==7-i) 
    {
	System.out.print("*");
    k=0;
    }else if(j==5+i)
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