public class Pyramid_5
{
  public static void main(String args[])
 { 
     int l=0;
     
     for(int i=1;i<=9;i++)
     {
	 
	 l=8;
     for(int j=1;j<=17;j++)
     {
      if(j>=10-i && j<=9)
      {
	  System.out.print(j);
	 
     }else if(i>=2 && j>=10 && j<=8+i)
     {
		 System.out.print(l);
		  l--;
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