public class Assignment_8_Loop
{

public static void main(String args[])
{
 for(int i=1;i<=4;i++)
 {
 for(int j=1;j<=24;j++)
 {
 if(i==1 && j==4 || i==2 && j==4 || i==3 && j==4 || i==4 && j==3 || i==4 && j==2 || i==3 && j==1 )
 {
  System.out.print("J");
 }
 else if(i==1 && j==9 || i==2 && j==8 || i==2 && j==10 || i==3 && j==7 || i==3 && j==8 || i==3 && j==9||
 i==3 && j==10|| i==3 && j==11|| i==4 && j==6|| i==4 && j==12)
{
  System.out.print("A");
 }
 else if(i==1 && j==12 || i==2 && j==13 || i==3 && j==14|| i==4 && j==15 || i==3 && j==16 || i==2 && j==17||
 i==1 && j==18)
 {
  System.out.print("V");
 }
 
 else if(i==1 && j==21 || i==2 && j==22 || i==2 && j==20 || i==3 && j==23 || i==3 && j==19 || i==4 && j==24||
 i==4 && j==18|| i==3 && j==20|| i==3 && j==21|| i==3 && j==22)
{
  System.out.print("A");
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

