public class Pyramid_4
{
  public static void main(String args[])
 { 
     int l=0;
     
     for(int i=1;i<=9;i++)
     {
	 int k=1;
	 l=i-1;
     for(int j=1;j<=17;j++)
     {
      if(j>=10-i && j<=9)
      {
	  System.out.print(k);
	  k++;
     
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