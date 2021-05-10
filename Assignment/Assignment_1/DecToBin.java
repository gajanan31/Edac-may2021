class DecToBin
{
 public static void main(String args[])
 {
  int i=0;
  int arr[]=new int[20];
  int n=5;
  
  while(n >= 0)
   {
    arr[i]=n%2;
	i++;
	n=n/2;
}
 	
System.out.println("Conversion of Dec to Bin ");
  
i--;
 while(i>=0)
 {
 System.out.print(arr[i]);
 i--;
 }
 
 }

}

