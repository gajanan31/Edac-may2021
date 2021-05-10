class AddBinary
{
 public static void main(String args[])
  {
   int bin1,bin2;
   int i=0,carry=0;
   int arr[]=new int[10];
   bin1=0;
   bin2=0;

   while(bin1 !=0 || bin2 != 0)
    {
	
		
	 arr[i] = (int)((bin1 % 10 + bin2 % 10 + carry) % 2);
	 i++;
	 carry = (int)((bin1 % 10 + bin2 % 10 + carry) / 2);
	 bin1 = bin1 / 10;
	 bin2 = bin2 / 10;
	
	}
	 if(carry!=0){
	 arr[i]=carry;
	 }
	 
	 System.out.println("Sum of two binary no ");
	 i--;
	 while(i>=0)
	 {
	 System.out.print(arr[i]);
	 i--;
	 
	 }
  
  }

}